(ns daily.day5-test
  (:require [clojure.test :refer :all]
            [daily.day5 :refer :all]))

(deftest q37-test
  (testing "q37 should pass"
    (is (= (q37 "ABC") true))))

(deftest q57-test
  (testing "q57 should pass"
    (is (= (q57 (list 5 4 3 2 1)) true))))

(deftest q68-test
  (testing "q68 should pass"
    (is (= (q68 (vector 7 6 5 4 3)) true))))

(deftest q71-test
  (testing "q71 should pass"
    (is (= (q71 last) true))))

(deftest q72-test
  (testing "q72 should pass"
    (is (= (q72 #(reduce + %)) true))))

(deftest q145-test
  (testing "q145 should pass"
    (is (= (q145 (list 1 5 9 13 17 21 25 29 33 37)) true))))