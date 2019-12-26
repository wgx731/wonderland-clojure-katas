(ns daily.day38-test
  (:require [clojure.test :refer :all]
            [daily.day38 :refer :all]))

(deftest q76-test
  (testing "q76 should pass"
    (is (= (q76 [1 3 5 7 9 11]) true))))

(deftest q78-test
  (testing "q78 should pass"
    (is (= (q78 #(->> (%1 %2)
                      (iterate (fn [f] (f)))
                      (drop-while fn?)
                      (first))) true))))

(deftest q79-test
  (testing "q79 should pass"
    (is (= (q79 (fn [rows]
                  (let [expand #(concat (take 1 %) (map min (butlast %) (rest %)) (take-last 1 %))
                        combine #(map + (expand %1) %2)]
                    (->> (reduce combine rows)
                         (apply min))))) true))))

(deftest q80-test
  (testing "q80 should pass"
    (is (= (q80 (fn [n]
                  (->> (range 1 n)
                       (filter #(zero? (mod n %)))
                       (apply +)
                       (= n)))) true))))

(deftest q84-test
  (testing "q84 should pass"
    (is (= (q84 (fn [s]
                  (let [news (for [[a b] s [c d] s
                                   :when (= b c)
                                   :when (not (contains? s [a d]))]
                               [a d])]
                    (if (empty? news)
                      s
                      (recur (into s news)))))) true))))
