(ns daily.day27-test
  (:require [clojure.test :refer :all]
            [daily.day27 :refer :all]))

(deftest q122-test
  (testing "q122 should pass"
    (is (= (q122 #(->> % (seq) (map (comp read-string str))
                       (reduce (fn [agg v] (+ (* agg 2) v)) 0))) true))))
