(ns daily.day15-test
  (:require [clojure.test :refer :all]
            [daily.day15 :refer :all]))

(deftest q46-test
  (testing "q46 should pass"
    (is (= (q46 (fn [f] (fn [a b] (f b a)))) true))))

(deftest q44-test
  (testing "q44 should pass"
    (is (= (q44 (fn [n xs] (cond
                             (= n 0) xs
                             (> n 0) (recur (dec n) (conj (vec (rest xs)) (first xs)))
                             (< n 0) (recur (inc n) (conj (drop-last xs) (last xs)))))) true))))

(deftest q43-test
  (testing "q43 should pass"
    (is (= (q43 #(apply map vector (partition-all %2 %1))) true))))