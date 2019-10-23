(ns daily.day11-test
  (:require [clojure.test :refer :all]
            [daily.day11 :refer :all]))

(deftest q51-test
  (testing "q51 should pass"
    (is (= (q51 [1 2 3 4 5]) true))))

(deftest q83-test
  (testing "q83 should pass"
    (is (= (q83 (fn [& xs]
                  (true? (and (some true? xs) (some false? xs))))) true))))

(deftest q66-test
  (testing "q66 should pass"
    (is (= (q66 (fn [x y]
                  (apply max
                         (filter #(= 0 (mod x %) (mod y %))
                                 (range 1 (+ 1 (max (/ x 2) (/ y 2)))))))) true))))