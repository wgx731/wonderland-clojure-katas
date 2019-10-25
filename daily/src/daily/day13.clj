(ns daily.day13)

(defn q100
  "http://www.4clojure.com/problem/100"
  [ans]
  (== (ans 2 3) 6)
  (== (ans 5 3 7) 105)
  (== (ans 1/3 2/5) 2)
  (== (ans 3/4 1/6) 3/2)
  (== (ans 7 5/7 2 3/5) 210))

(defn q97
  "http://www.4clojure.com/problem/97"
  [ans]
  (= (ans 1) [1])
  (= (map ans (range 1 6)) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]])
  (= (ans 11) [1 10 45 120 210 252 210 120 45 10 1]))
