(ns daily.day36-test
  (:require [clojure.test :refer :all]
            [daily.day36 :refer :all]))

(deftest q56-test
  (testing "q56 should pass"
    (is (= (q56 (fn [col]
                  (reduce (fn [xs x]
                            (if (some #(= x %) xs)
                              xs
                              (conj xs x))) [] col))) true))))

(deftest q58-test
  (testing "q58 should pass"
    (is (= (q58 (fn [& fs]
                  (fn [& args]
                    (first (reduce
                             #(list (apply %2 %1))
                             args
                             (reverse fs)))))) true))))
