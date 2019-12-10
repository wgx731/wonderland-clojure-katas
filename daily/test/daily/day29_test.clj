(ns daily.day29-test
  (:require [clojure.test :refer :all]
            [daily.day29 :refer :all]))

(deftest q195-test
  (testing "q195 should pass"
    (is (= (q195 (fn p [n]
                   (if (zero? n) #{""}
                                 (into #{}
                                       (for [i (range n)
                                             j (p i)
                                             k (p (- n 1 i))]
                                         (str \( j \) k)))))) true))))
