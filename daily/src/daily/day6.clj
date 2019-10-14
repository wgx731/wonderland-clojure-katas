(ns daily.day6
  (:require [clojure.set]))

(defn q20
  "http://www.4clojure.com/problem/20"
  [ans]
  (and (= (ans (list 1 2 3 4 5)) 4) (= (ans ["a" "b" "c"]) "b") (= (ans [[1 2] [3 4]]) [1 2])))

(defn q24
  "http://www.4clojure.com/problem/24"
  [ans]
  (and
    (= (ans [1 2 3]) 6)
    (= (ans (list 0 -2 5 5)) 8)
    (= (ans #{4 2 1}) 7)
    (= (ans '(0 0 -1)) -1)
    (= (ans '(1 10 3)) 14)
    ))

(defn q25
  "http://www.4clojure.com/problem/25"
  [ans]
  (and
    (= (ans #{1 2 3 4 5}) '(1 3 5))
    (= (ans [4 2 1 6]) '(1))
    (= (ans [2 2 4 6]) '())
    (= (ans [1 1 1 3]) '(1 1 1 3))
    ))

(defn q27
  "http://www.4clojure.com/problem/27"
  [ans]
  (and
    (false? (ans '(1 2 3 4 5)))
    (true? (ans "racecar"))
    (true? (ans [:foo :bar :foo]))
    (true? (ans '(1 1 3 3 1 1)))
    (false? (ans '(:a :b :c)))
    ))

(defn q32
  "http://www.4clojure.com/problem/32"
  [ans]
  (and
    (= (ans [1 2 3]) '(1 1 2 2 3 3))
    (= (ans [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
    (= (ans [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
    (= (ans [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
    ))
