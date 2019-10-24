(ns daily.day12-test
  (:require [clojure.test :refer :all]
            [clojure.set :refer :all]
            [daily.day12 :refer :all]))

(deftest q107-test
  (testing "q107 should pass"
    (is (= (q107 (fn [n]
                   (partial (fn [n x]
                              (reduce * (take n (repeat x)))) n))) true))))

(deftest q90-test
  (testing "q90 should pass"
    (is (= (q90 (fn [xs ys]
                  (set (for [x xs y ys]
                         [x y])))) true))))

(deftest q88-test
  (testing "q88 should pass"
    (is (= (q88 (fn [xs ys] (union (difference xs ys) (difference ys xs)))) true))))
