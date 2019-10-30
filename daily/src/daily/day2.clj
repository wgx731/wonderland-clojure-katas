(ns daily.day2)

(defn q3
  "http://www.4clojure.com/problem/3"
  [ans]
  (= ans (.toUpperCase "hello world")))

(defn q4
  "http://www.4clojure.com/problem/4"
  [a1 a2 a3]
  (= (list a1 a2 a3) '(:a :b :c)))

(defn q5
  "http://www.4clojure.com/problem/5"
  [ans]
  (= ans (conj '(2 3 4) 1) (conj '(3 4) 2 1)))

(defn q6
  "http://www.4clojure.com/problem/6"
  [a1 a2 a3]
  (= [a1 a2 a3] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))

(defn q7
  "http://www.4clojure.com/problem/7"
  [ans]
  (= ans (conj [1 2 3] 4) (conj [1 2] 3 4)))