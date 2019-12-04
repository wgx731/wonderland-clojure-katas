(ns daily.day26)

(defn q143
  "http://www.4clojure.com/problem/143"
  [ans]
  (and
    (= 0 (ans [0 1 0] [1 0 0]))
    (= 3 (ans [1 1 1] [1 1 1]))
    (= 32 (ans [1 2 3] [4 5 6]))
    (= 256 (ans [2 5 6] [100 10 1]))))

(defn q144
  "http://www.4clojure.com/problem/144"
  [ans]
  (and
    (= (take 3 (ans 3.14 int double)) [3.14 3 3.0])
    (= (take 5 (ans 3 #(- % 3) #(+ 5 %))) [3 0 5 2 7])
    (= (take 12 (ans 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3])))

(defn q146
  "http://www.4clojure.com/problem/146"
  [ans]
  (and
    (= (ans '{a {p 1, q 2}
             b {m 3, n 4}})
       '{[a p] 1, [a q] 2
         [b m] 3, [b n] 4})
    (= (ans '{[1] {a b c d}
             [2] {q r s t u v w x}})
       '{[[1] a] b, [[1] c] d,
         [[2] q] r, [[2] s] t,
         [[2] u] v, [[2] w] x})
    (= (ans '{m {1 [a b c] 3 nil}})
       '{[m 1] [a b c], [m 3] nil})))


