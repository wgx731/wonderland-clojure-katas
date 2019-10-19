(ns daily.day9-test
  (:require [clojure.test :refer :all]
            [clojure.string :refer :all]
            [daily.day9 :refer :all]))

(deftest q26-test
  (testing "q26 should pass"
    (is (= (q26 #(take % (map first (iterate (fn [[a b]] [b (+ a b)])
                             [1 1])))) true))))

(deftest q29-test
  (testing "q29 should pass"
    (is (= (q29 #(join "" (filter (fn [c] (Character/isUpperCase c)) %))) true))))