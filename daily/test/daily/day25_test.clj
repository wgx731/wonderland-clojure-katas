(ns daily.day25-test
  (:require [clojure.test :refer :all]
            [daily.day25 :refer :all]))

(deftest q99-test
  (testing "q99 should pass"
    (is (= (q99 (fn [a b]
                  (->> (* a b)
                       (str)
                       (mapcat list)
                       (map str)
                       (map read-string)))) true))))

(deftest q101-test
  (testing "q101 should pass"
    (is (= (q101 (fn lev [s t]
                   (cond
                     (empty? s) (count t)
                     (empty? t) (count s)
                     :else
                     (let [ns (rest s)
                           nt (rest t)]
                       (if (= (first s) (first t))
                         (lev ns nt)
                         (min
                           (inc (lev s nt))
                           (inc (lev ns t))
                           (inc (lev ns nt)))))))) true))))
