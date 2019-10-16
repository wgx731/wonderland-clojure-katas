(ns daily.day8
  (:require [clojure.set]))

(defn q45
  "http://www.4clojure.com/problem/45"
  [ans]
  (= ans (take 5 (iterate #(+ 3 %) 1))))

(defn q33
  "http://www.4clojure.com/problem/33"
  [ans]
  (and
    (= (ans [1 2 3] 2) '(1 1 2 2 3 3))
    (= (ans [:a :b] 4) '(:a :a :a :a :b :b :b :b))
    (= (ans [4 5 6] 1) '(4 5 6))
    (= (ans [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
    (= (ans [44 33] 2) [44 44 33 33])
   ))

