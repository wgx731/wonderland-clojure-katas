(ns daily.day22)

(defn q34
  "http://www.4clojure.com/problem/34"
  [ans]
  (and
    (= (ans 1 4) '(1 2 3))
    (= (ans -2 2) '(-2 -1 0 1))
    (= (ans 5 8) '(5 6 7))))

(defn q53
  "http://www.4clojure.com/problem/53"
  [ans]
  (and
    (= (ans [1 0 1 2 3 0 4 5]) [0 1 2 3])
    (= (ans [5 6 1 3 2 7]) [5 6])
    (= (ans [2 3 3 4 5]) [3 4 5])
    (= (ans [7 6 5 4]) [])))
