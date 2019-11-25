(ns daily.day21-test
  (:require [clojure.test :refer :all]
            [daily.day21 :refer :all]))

(deftest q21-test
  (testing "q21 should pass"
    (is (= (q21 (fn [coll n] (->> coll
                                  (take (inc n))
                                  (last)))) true))))

(deftest q22-test
  (testing "q22 should pass"
    (is (= (q22 #((fn [coll n] (if (empty? coll)
                                 n
                                 (recur (rest coll) (inc n))))
                  % 0)) true))))

(deftest q23-test
  (testing "q23 should pass"
    (is (= (q23 (fn f [xs]
                  (when xs
                    (cons (last xs) (f (butlast xs)))))) true))))

(deftest q26-test
  (testing "q26 should pass"
    (is (= (q26 #(take % ((fn fib [a b]
                            (lazy-seq (cons a (fib b (+ a b)))))
                          1 1))) true))))

(deftest q28-test
  (testing "q28 should pass"
    (is (= (q28 #(filter (complement sequential?)
                         (rest (tree-seq sequential? seq %)))) true))))
