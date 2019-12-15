(ns daily.day31-test
  (:require [clojure.test :refer :all]
            [daily.day31 :refer :all]))

(deftest q118-test
  (testing "q118 should pass"
    (is (= (q118 (fn func [f coll]
                   (if (not-empty coll)
                     (lazy-seq
                       (cons (f (first coll)) (func f (rest coll))))))) true))))

(deftest q119-test
  (testing "q119 should pass"
    (is (= (q119 (fn [p b]
                   (letfn [(winner [b]
                             (some {[:o :o :o] :o [:x :x :x] :x}
                                   (concat b
                                           (apply map list b)
                                           (list
                                             (map #((b %) %) [0 1 2])
                                             (map #((b %) (- 2 %)) [0 1 2])))))]
                     (set
                       (for [y (range 3)
                             x (range 3)
                             :when (= :e ((b y) x))
                             :when (= p (winner (assoc-in b [y x] p)))]
                         [y x]))))) true))))
