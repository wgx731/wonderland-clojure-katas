(ns daily.day19-test
  (:require [clojure.test :refer :all]
            [daily.day19 :refer :all]))

(deftest q64-test
  (testing "q64 should pass"
    (is (= (q64 +) true))))

(deftest q54-test
  (testing "q54 should pass"
    (is (= (q54 (fn partition-seq [n coll]
                  (loop [c coll partitioned []]
                    (if (< (count c) n)
                      partitioned
                      (recur (drop n c) (conj partitioned (take n c)))))))
           true))))

(deftest q55-test
  (testing "q55 should pass"
    (is (= (q55 (fn [coll]
                  (persistent!
                    (reduce (fn [counts x]
                              (assoc! counts x (inc (get counts x 0))))
                            (transient {}) coll)))) true))))
