(ns daily.day15)

(defn q46
  "http://www.4clojure.com/problem/46"
  [ans]
  (and
    (= 3 ((ans nth) 2 [1 2 3 4 5]))
    (= true ((ans >) 7 8))
    (= 4 ((ans quot) 2 8))
    (= [1 2 3] ((ans take) [1 2 3 4 5] 3))))

(defn q44
  "http://www.4clojure.com/problem/44"
  [ans]
  (and
    (= (ans 2 [1 2 3 4 5]) '(3 4 5 1 2))
    (= (ans -2 [1 2 3 4 5]) '(4 5 1 2 3))
    (= (ans 6 [1 2 3 4 5]) '(2 3 4 5 1))
    (= (ans 1 '(:a :b :c)) '(:b :c :a))
    (= (ans -4 '(:a :b :c)) '(:c :a :b))))

(defn q43
  "http://www.4clojure.com/problem/43"
  [ans]
  (println (ans [1 2 3 4 5 6] 2))
  (and
    (= (ans [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))
    (= (ans (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))
    (= (ans (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))))
