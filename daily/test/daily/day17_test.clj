(ns daily.day17-test
  (:require [clojure.test :refer :all]
            [daily.day17 :refer :all]))

(deftest q35-test
  (testing "q35 should pass"
    (is (= (q35 7) true))))

(deftest q36-test
  (testing "q36 should pass"
    (is (= (q36 0) true))))

(deftest q38-test
  (testing "q38 should pass"
    (is (= (q38 (fn [& args] (last (sort args)))) true))))

(deftest q39-test
  (testing "q39 should pass"
    (is (= (q39 #(mapcat list %1 %2)) true))))

(deftest q40-test
  (testing "q40 should pass"
    (is (= (q40 (fn [item coll]
                  (->> coll
                       (mapcat #(list % item))
                       (drop-last)))) true))))
