(ns daily.day3
  (:require [clojure.set]))

(defn q8
  "http://www.4clojure.com/problem/8"
  [ans]
  (= ans (set '(:a :a :b :c :c :c :c :d :d)) (clojure.set/union #{:a :b :c} #{:b :c :d})))

(defn q9
  "http://www.4clojure.com/problem/9"
  [ans]
  (= #{1 2 3 4} (conj #{1 4 3} ans)))

(defn q10
  "http://www.4clojure.com/problem/10"
  [ans]
  (= ans ((hash-map :a 10, :b 20, :c 30) :b) (:b {:a 10, :b 20, :c 30})))

(defn q11
  "http://www.4clojure.com/problem/11"
  [ans]
  (= {:a 1, :b 2, :c 3} (conj {:a 1} ans [:c 3])))

(defn q12
  "http://www.4clojure.com/problem/12"
  [ans]
  (= ans (first '(3 2 1)) (second [2 3 4]) (last (list 1 2 3))))
