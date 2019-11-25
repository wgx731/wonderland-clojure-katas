(ns daily.day21)

(defn q21
  "http://www.4clojure.com/problem/21"
  [ans]
  (and
    (= (ans '(4 5 6 7) 2) 6)
    (= (ans [:a :b :c] 0) :a)
    (= (ans [1 2 3 4] 1) 2)
    (= (ans '([1 2] [3 4] [5 6]) 2) [5 6])))


(defn q22
  "http://www.4clojure.com/problem/22"
  [ans]
  (and
    (= (ans '(1 2 3 3 1)) 5)
    (= (ans "Hello World") 11)
    (= (ans [[1 2] [3 4] [5 6]]) 3)
    (= (ans '(13)) 1)
    (= (ans '(:a :b :c)) 3)))

(defn q23
  "http://www.4clojure.com/problem/23"
  [ans]
  (and
    (= (ans [1 2 3 4 5]) [5 4 3 2 1])
    (= (ans (sorted-set 5 7 2 7)) '(7 5 2))
    (= (ans [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])))

(defn q26
  "http://www.4clojure.com/problem/26"
  [ans]
  (and
    (= (ans 3) '(1 1 2))
    (= (ans 6) '(1 1 2 3 5 8))
    (= (ans 8) '(1 1 2 3 5 8 13 21))))

(defn q28
  "http://www.4clojure.com/problem/28"
  [ans]
  (and
    (= (ans '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
    (= (ans ["a" ["b"] "c"]) '("a" "b" "c"))
    (= (ans '((((:a))))) '(:a))))
