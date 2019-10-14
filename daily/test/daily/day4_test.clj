(ns daily.day4-test
  (:require [clojure.test :refer :all]
            [daily.day4 :refer :all]))

(deftest q13-test
  (testing "q13 should pass"
    (is (= (q13 (list 20 30 40)) true))))

(deftest q14-test
  (testing "q14 should pass"
    (is (= (q14 8) true))))

(deftest q15-test
  (testing "q15 should pass"
    (is (= (q15 #(* % 2)) true))))

(deftest q16-test
  (testing "q16 should pass"
    (is (= (q16 #(str "Hello, " % "!")) true))))

(deftest q17-test
  (testing "q17 should pass"
    (is (= (q17 (list 6 7 8)) true))))

(deftest q18-test
  (testing "q18 should pass"
    (is (= (q18 (list 6 7)) true))))

(deftest q19-test
  (testing "q19 should pass"
    (is (= (q19 #(if (next %) (recur (next %)) (first %))) true))))

