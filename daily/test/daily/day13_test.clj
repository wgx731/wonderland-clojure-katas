(ns daily.day13-test
  (:require [clojure.test :refer :all]
            [daily.day13 :refer :all]))

(deftest q100-test
  (testing "q100 should pass"
    (is (= (q100 (fn [& xs]
                   (/ (apply * xs)
                      (reduce #(if (zero? %2) % (recur %2 (mod % %2))) xs)))) true))))

(deftest q97-test
  (testing "q97 should pass"
    (is (= (q97 (fn [i]
                  (reduce
                    #(conj %1 (* (last %1) (/ (- i %2) %2)))
                    [1] (range 1 i)))) true))))