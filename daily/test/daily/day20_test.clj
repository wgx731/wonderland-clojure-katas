(ns daily.day20-test
  (:require [clojure.test :refer :all]
            [daily.day20 :refer :all]))

(deftest q134-test
  (testing "q134 should pass"
    (is (= (q134 #(nil? (get %2 %1 " "))) true))))

(deftest q162-test
  (testing "q162 should pass"
    (is (= (q162 1) true))))

(deftest q161-test
  (testing "q161 should pass"
    (is (= (q161 #{1 2}) true))))

(deftest q156-test
  (testing "q156 should pass"
    (is (= (q156 (fn [d coll]
                   (apply array-map (mapcat (fn [x] [x d]) coll)))) true))))

(deftest q157-test
  (testing "q157 should pass"
    (is (= (q157 #(map vector % (range))) true))))
