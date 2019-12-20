(ns daily.day35-test
  (:require [clojure.test :refer :all]
            [daily.day35 :refer :all]))

(deftest q147-test
  (testing "q147 should pass"
    (is (= (q147 (fn [v]
                   (iterate #(vec (map +' (cons 0 %) (conj % 0))) v))) true))))

(deftest q153-test
  (testing "q153 should pass"
    (is (= (q153 #(apply distinct? (mapcat seq %))) true))))

