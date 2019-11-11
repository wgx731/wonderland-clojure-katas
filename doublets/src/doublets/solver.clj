(ns doublets.solver
  (:require [clojure.java.io :as io-lib]))

(def words (-> "words.edn"
               (io-lib/resource)
               (slurp)
               (read-string)))

(defn- number-of-different-chars [word1 word2]
  (count (filter false? (map = word1 word2))))

(defn- potential-next-word? [word next-word already-used-words]
  (and (not (contains? already-used-words next-word))
       (= (count word) (count next-word))
       (= 1 (number-of-different-chars word next-word))))

(defn- next-words-to-check [word goal already-used-words]
  (->> words
       (filter #(potential-next-word? word % already-used-words))
       (sort-by #(number-of-different-chars goal %))))

(defn- reach-goal-from-word [word goal already-used-words]
  (if (= word goal)
    (list goal)
    (if-let [next-words
             (some #(reach-goal-from-word % goal (conj already-used-words %))
                   (next-words-to-check word goal already-used-words))]
      (conj next-words word))))

(defn doublets [word1 word2]
  (or (reach-goal-from-word word1 word2 (set [word1]))
      (list)))
