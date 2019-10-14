(ns daily.day6-test
  (:require [clojure.test :refer :all]
            [daily.day6 :refer :all]))

(deftest q20-test
  (testing "q20 should pass"
    (is (= (q20 #(if (nil? (next (next %))) (first %) (recur (next %)))) true))))

(deftest q24-test
  (testing "q24 should pass"
    (is (= (q24 #(reduce + %)) true))))

(deftest q25-test
  (testing "q25 should pass"
    (is (= (q25 #(filter odd? %)) true))))

(deftest q27-test
  (testing "q27 should pass"
    (is (= (q27 #(= (seq %) (reverse %))) true))))

(deftest q32-test
  (testing "q32 should pass"
    (is (= (q32 #(mapcat (fn [item] (list item item)) %)) true))))
