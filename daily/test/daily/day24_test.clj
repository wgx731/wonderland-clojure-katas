(ns daily.day24-test
  (:require [clojure.test :refer :all]
            [daily.day24 :refer :all]))

(deftest q81-test
  (testing "q81 should pass"
    (is (= (q81 (fn [sa sb]
                  (set (filter #(sa %) sb)))) true))))

(deftest q82-test
  (testing "q82 should pass"
    (is (= (q82 (fn [xs]
                  (letfn [(one-d [[a & a-rest] [b & b-rest :as bs]]
                            (if (= a b)
                              (recur a-rest b-rest)
                              (= (apply str a-rest) (apply str bs))))
                          (chains? [l r]
                            (let [[count-l count-r] (map count [l r])]
                              (cond
                                (= count-l count-r) (= 1 (apply + (map #(if (= %1 %2) 0 1) l r)))
                                (= 1 (- count-l count-r)) (one-d l r)
                                (= -1 (- count-l count-r)) (one-d r l)
                                :else false)))
                          (transitions []
                            (->>
                              (for [x xs y xs :when (chains? x y)] [x y])
                              (group-by first)
                              (reduce-kv #(assoc %1 %2 (map second %3)) {})))
                          (moves
                            ([trs] (moves trs (keys trs)))
                            ([trs keys]
                             (if (empty? trs)
                               true
                               (some true? (map #(if-let [chain (get trs %1)]
                                                   (moves (dissoc trs %1) chain))
                                                keys)))))]
                    (or (moves (transitions)) false)))) true))))

(deftest q166-test
  (testing "q166 should pass"
    (is (= (q166 (fn [op a b]
                   (cond
                     (op a b) :lt
                     (op b a) :gt
                     :else :eq))) true))))
