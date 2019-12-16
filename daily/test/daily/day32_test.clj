(ns daily.day32-test
  (:require [clojure.test :refer :all]
            [daily.day32 :refer :all]))

(deftest q120-test
  (testing "q120 should pass"
    (is (= (q120 (fn [coll]
                   (let [sumOfSquaredComponent
                         (->> coll
                              (map str)
                              (map seq)
                              (map #(map (fn [x] (Integer/parseInt (str x))) %))
                              (map #(map (fn [x] (* x x)) %))
                              (map #(reduce + %)))]
                     (count (filter true? (map > sumOfSquaredComponent coll)))))) true))))

(deftest q121-test
  (testing "q121 should pass"
    (is (= (q121 (fn computation-engine [expr]
                   (fn [vars]
                     (letfn [(compute [expr]
                               (if (list? expr)
                                 (apply ({'+ + '- - '* * '/ /}
                                         (first expr))
                                        (map compute (next expr)))
                                 (vars expr expr)))]
                       (compute expr))))) true))))

