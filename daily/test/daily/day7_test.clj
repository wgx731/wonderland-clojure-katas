(ns daily.day7-test
  (:require [clojure.test :refer :all]
            [daily.day7 :refer :all]))

(deftest q30-test
  (testing "q30 should pass"
    (is (= (q30 #(->> %
                      (partition-by identity)
                      (map first))) true))))

(deftest q31-test
  (testing "q31 should pass"
    (is (= (q31 #(partition-by identity %)) true))))

(deftest q41-test
  (testing "q41 should pass"
    (is (= (q41 (fn [coll n] (->> coll
                                  (partition-all n)
                                  (mapcat #(take (dec n) %))))) true))))