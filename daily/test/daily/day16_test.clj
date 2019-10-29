(ns daily.day16-test
  (:require [clojure.test :refer :all]
            [daily.day16 :refer :all]))

(deftest q50-test
  (testing "q50 should pass"
    (is (= (q50 #(->> % (group-by type) (vals))) true))))

(deftest q67-test
  (testing "q67 should pass"
    (is (= (q67 #(->> (range) (filter (fn [x] (.isProbablePrime (BigInteger/valueOf x) 5))) (take %))) true))))

(deftest q77-test
  (testing "q77 should pass"
    (is (= (q77 #(->> (group-by sort %)
                      (vals)
                      (map set)
                      (filter (comp seq rest))
                      (set))) true))))
