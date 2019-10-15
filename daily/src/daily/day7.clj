(ns daily.day7
  (:require [clojure.set]))

(defn q30
  "http://www.4clojure.com/problem/30"
  [ans]
  (and
    (= (apply str (ans "Leeeeeerrroyyy")) "Leroy")
    (= (ans [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
    (= (ans [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
    ))

(defn q31
  "http://www.4clojure.com/problem/31"
  [ans]
  (and
    (= (ans [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
    (= (ans [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
    (= (ans [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
    ))

(defn q41
  "http://www.4clojure.com/problem/41"
  [ans]
  (and
    (= (ans [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
    (= (ans [:a :b :c :d :e :f] 2) [:a :c :e])
    (= (ans [1 2 3 4 5 6] 4) [1 2 3 5 6])
    ))

