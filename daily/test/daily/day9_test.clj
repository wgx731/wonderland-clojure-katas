(ns daily.day9-test
  (:require [clojure.test :refer :all]
            [daily.day9 :refer :all]))

(deftest q26-test
  (testing "q26 should pass"
    (is (= (q26 #(->> [1 1]
                      (iterate (fn [[a b]] [b (+ a b)]))
                      (take %)
                      (map first))) true))))

(deftest q29-test
  (testing "q29 should pass"
    (is (= (q29 #(->> %
                      (filter (fn [c] (Character/isUpperCase c)))
                      (clojure.string/join ""))) true))))