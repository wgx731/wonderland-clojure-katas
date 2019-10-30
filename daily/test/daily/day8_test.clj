(ns daily.day8-test
  (:require [clojure.test :refer :all]
            [daily.day8 :refer :all]))

(deftest q45-test
  (testing "q45 should pass"
    (is (= (q45 (list 1 4 7 10 13)) true))))

(deftest q33-test
  (testing "q33 should pass"
    (is (= (q33 #(mapcat (fn [item] (take %2 (iterate identity item))) %1)) true))))