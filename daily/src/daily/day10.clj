(ns daily.day10)

(defn q48
  "http://www.4clojure.com/problem/48"
  [ans]
    (= ans (some #{2 7 6} [5 6 7 8]) (some #(when (even? %) %) [5 6 7 8])))

(defn q42
  "http://www.4clojure.com/problem/42"
  [ans]
  (and
    (= (ans 1) 1)
    (= (ans 3) 6)
    (= (ans 5) 120)
    (= (ans 8) 40320)))

(defn q52
  "http://www.4clojure.com/problem/52"
  [ans]
  (= [2 4] ans))
