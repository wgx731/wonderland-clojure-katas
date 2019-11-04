(ns doublets.solver
  (:require [clojure.java.io :as io-lib]))

(def words (-> "words.edn"
               (io-lib/resource)
               (slurp)
               (read-string)))

(defn- char-diff-count [w1 w2]
  (get (frequencies (map = w1 w2)) false 0))

(defn- next-words [word]
  (->> (set words)
       (filter #(= 1 (char-diff-count word %)))))

;; TODO: write main doublets function

(defn- hamming-distance [x y]
  (and
    (= (count x) (count y))
    (->> [x y]
         (apply map not=)
         (filter identity)
         count)))

(defn- next-steps [dict x]
  (map
    #(conj x %)
    (filter
      #(= 1 (hamming-distance (last x) %))
      dict)))

(defn doublets [word1 word2]
  (loop [path [[word1]] n (count words)]
    (let [matching-path (filter #(some #{word2} %) path)]
      (or
        (first matching-path)
        (if (< n 0) [])
        (recur (apply concat (map #(next-steps words %) path)) (dec n))))))
