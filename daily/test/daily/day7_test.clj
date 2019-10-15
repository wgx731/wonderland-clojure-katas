(ns daily.day7-test
  (:require [clojure.test :refer :all]
            [daily.day7 :refer :all]))

(deftest q30-test
  (testing "q30 should pass"
    (is (= (q30 #(reduce (fn [r x] (if (= (last r) x) r (conj r x)))
                         [] %)) true))))

(deftest q31-test
  (testing "q31 should pass"
    (is (= (q31 #(partition-by identity %)) true))))

(defn drop-nth
  [n coll]
  (->> coll
       (map vector (iterate inc 1))
       (remove #(zero? (mod (first %) n)))
       (map second)))

(deftest q41-test
  (testing "q41 should pass"
    (is (= (q41 (fn [coll n]
                  (mapcat #(take (dec n) %) (partition-all n coll))))) true)))
