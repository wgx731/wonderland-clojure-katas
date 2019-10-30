(ns daily.day3-test
  (:require [clojure.test :refer :all]
            [daily.day3 :refer :all]))


(deftest q8-test
  (testing "q8 should pass"
    (is (= (q8 #{:a :b :c :d}) true))))

(deftest q9-test
  (testing "q9 should pass"
    (is (= (q9 2) true))))

(deftest q10-test
  (testing "q10 should pass"
    (is (= (q10 20) true))))

(deftest q11-test
  (testing "q11 should pass"
    (is (= (q11 [:b 2]) true))))

(deftest q12-test
  (testing "q12 should pass"
    (is (= (q12 3) true))))