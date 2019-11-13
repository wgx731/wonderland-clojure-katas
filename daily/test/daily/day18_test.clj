(ns daily.day18-test
  (:require [clojure.test :refer :all]
            [daily.day18 :refer :all]))

(deftest q47-test
  (testing "q47 should pass"
    (is (= (q47 4) true))))

(deftest q49-test
  (testing "q49 should pass"
    (is (= (q49 (fn [n coll]
                  [(take n coll) (drop n coll)])) true))))
