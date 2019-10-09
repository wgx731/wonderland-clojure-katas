(ns daily.day2-test
  (:require [clojure.test :refer :all]
            [daily.day2 :refer :all]))


(deftest q3-test
  (testing "q3 should pass"
    (is (= (q3 "HELLO WORLD") true))))

(deftest q4-test
  (testing "q4 should pass"
    (is (= (q4 :a :b :c) true))))

(deftest q5-test
  (testing "q5 should pass"
    (is (= (q5 (list 1 2 3 4)) true))))

(deftest q6-test
  (testing "q6 should pass"
    (is (= (q6 :a :b :c) true))))

(deftest q7-test
  (testing "q7 should pass"
    (is (= (q7 [1 2 3 4]) true))))
