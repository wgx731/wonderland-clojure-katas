(ns daily.day11)

(defn q51
  "http://www.4clojure.com/problem/51"
  [ans]
  (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] ans] [a b c d])))

(defn q83
  "http://www.4clojure.com/problem/83"
  [ans]
  (= false (ans false false))
  (= true (ans true false))
  (= false (ans true))
  (= true (ans false true false))
  (= false (ans true true true))
  (= true (ans true true true false)))

(defn q66
  "http://www.4clojure.com/problem/66"
  [ans]
  (= (ans 2 4) 2)
  (= (ans 10 5) 5)
  (= (ans 5 7) 1)
  (= (ans 1023 858) 33))
