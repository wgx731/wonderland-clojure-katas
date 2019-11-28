(ns daily.day23-test
  (:require [clojure.test :refer :all]
            [daily.day23 :refer :all]))

(deftest q61-test
  (testing "q61 should pass"
    (is (= (q61 (fn [keys vals]
                  (loop [map {}
                         ks (seq keys)
                         vs (seq vals)]
                    (if (and ks vs)
                      (recur (assoc map (first ks) (first vs))
                             (next ks)
                             (next vs))
                      map)))) true))))

(deftest q62-test
  (testing "q62 should pass"
    (is (= (q62 (fn it [f x]
                  (lazy-seq (cons x (it f (f x)))))) true))))

(deftest q63-test
  (testing "q63 should pass"
    (is (= (q63 (fn [f coll]
                  (persistent!
                    (reduce
                      (fn [ret x]
                        (let [k (f x)]
                          (assoc! ret k (conj (get ret k []) x))))
                      (transient {}) coll)))) true))))

(deftest q65-test
  (testing "q65 should pass"
    (is (= (q65 (fn black-box [c]
                  ((zipmap (map str [{} #{} () []]) [:map :set :list :vector]) (str (empty c))))) true))))

(deftest q69-test
  (testing "q69 should pass"
    (is (= (q69 (fn [f & args]
                  (reduce (fn [map1 map2]
                            (reduce (fn [m [k v]]
                                      (if-let [vv (m k)]
                                        (assoc m k (f vv v))
                                        (assoc m k v)))
                                    map1 map2)) args))) true))))
