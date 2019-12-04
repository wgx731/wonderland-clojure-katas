(ns daily.day26-test
  (:require [clojure.test :refer :all]
            [daily.day26 :refer :all]))

(deftest q143-test
  (testing "q143 should pass"
    (is (= (q143 (fn [a b]
                   (reduce + (map * a b)))) true))))

(deftest q144-test
  (testing "q144 should pass"
    (is (= (q144 (fn [init-num & functions]
                   (reductions #(%2 %1) init-num (cycle functions)))) true))))

(deftest q146-test
  (testing "q146 should pass"
    (is (= (q146 (fn [mp]
                   (into {}
                         (for [[k v] mp
                               [vk vv] v]
                           (vec [[k vk] vv]))))) true))))

