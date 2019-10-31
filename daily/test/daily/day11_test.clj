(ns daily.day11-test
  (:require [clojure.test :refer :all]
            [daily.day11 :refer :all]))

(deftest q51-test
  (testing "q51 should pass"
    (is (= (q51 [1 2 3 4 5]) true))))

(deftest q83-test
  (testing "q83 should pass"
    (is (= (q83 (fn [& xs] (->> (and (some true? xs) (some false? xs))
                                (true?)))) true))))

(deftest q66-test
  (testing "q66 should pass"
    (is (= (q66 (fn [a r]
                  (cond
                    (< a r) (recur r a)
                    (not= 0 (mod a r)) (recur r (mod a r))
                    :else r))) true))))