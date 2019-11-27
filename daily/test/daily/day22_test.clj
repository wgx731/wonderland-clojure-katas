(ns daily.day22-test
  (:require [clojure.test :refer :all]
            [daily.day22 :refer :all]))

(deftest q34-test
  (testing "q34 should pass"
    (is (= (q34 (fn [start end] (take (- end start) (iterate inc' start)))) true))))

(deftest q53-test
  (testing "q53 should pass"
    (is (= (q53 (fn [coll]
                  (let [a (partition-by #(< (first %) (last %)) (partition 2 1 coll))
                        b (filter #(< (ffirst %) (second (first %))) a)
                        c (reduce #(if (< (count %1) (count %2)) %2 %1) [] b)]
                    (concat (first c) (map last (rest c)))))) true))))
