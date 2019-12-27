(ns daily.day39-test
  (:require [clojure.test :refer :all]
            [daily.day39 :refer :all]))

(deftest q102-test
  (testing "q102 should pass"
    (is (= (q102 #(clojure.string/replace
                    % #"\-."
                    (comp clojure.string/upper-case last))) true))))

(deftest q103-test
  (testing "q103 should pass"
    (is (= (q103 (fn ff [n xs]
                   (if (zero? n)
                     #{#{}}
                     (set (for [x xs
                                y (ff (dec n) (disj xs x))]
                            (conj y x)))))) true))))

(deftest q104-test
  (testing "q104 should pass"
    (is (= (q104 (fn r [x]
                   (if (= x 0) ""
                               (let [R (sorted-map
                                         1 "I", 4 "IV", 5 "V", 9 "IX",
                                         10 "X", 40 "XL", 50 "L",
                                         90 "XC", 100 "C", 400 "CD",
                                         500 "D", 900 "CM", 1000 "M")
                                     m (first (filter #(>= x (key %)) (reverse R)))]
                                 (str (val m) (r (- x (key m)))))))) true))))

(deftest q105-test
  (testing "q105 should pass"
    (is (= (q105 #(->> (partition-by keyword? %)
                       (partition 2)
                       (reduce (fn [agg [k v]]
                                 (-> (zipmap (reverse k) (cons v (repeat ())))
                                     (into agg))) {}))) true))))

(deftest q106-test
  (testing "q106 should pass"
    (is (= (q106 (fn f
                   ([n1 n2]
                    (if (= n1 n2)
                      1
                      (f [n1] n2 (fn [x] (* x 2)) (fn [x] (+ x 2)) (fn [x] (/ x 2)) 1)
                      ))
                   ([n1 n2 d-n a-2 h-n steps]
                    (if (some #(= % n2) n1)
                      steps
                      (recur (mapcat #(vector (d-n %) (a-2 %) (h-n %)) n1) n2 d-n a-2 h-n (inc steps)))))) true))))
