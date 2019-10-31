(ns daily.day10-test
  (:require [clojure.test :refer :all]
            [daily.day10 :refer :all]))

(deftest q48-test
  (testing "q48 should pass"
    (is (= (q48 6) true))))

(deftest q42-test
  (testing "q42 should pass"
    (is (= (q42 #(reduce * (range 1 (inc %)))) true))))

(deftest q52-test
  (testing "q52 should pass"
    (is (= (q52 (let [[a b c d e] [0 1 2 3 4]] (list c e))) true))))
