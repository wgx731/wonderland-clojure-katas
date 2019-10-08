(ns daily.day1-test
  (:require [clojure.test :refer :all]
            [daily.day1 :refer :all]))

(deftest q1-test
  (testing "q1 should pass"
    (is (= (q1 true) true))))

(deftest q2-test
  (testing "q2 should pass"
    (is (= (q2 4) true))))
