(ns daily.day19)

(defn q64
  "http://www.4clojure.com/problem/64"
  [ans]
  (and
    (= 15 (reduce ans [1 2 3 4 5]))
    (= 0 (reduce ans []))
    (= 6 (reduce ans 1 [2 3]))))

(defn q54
  "http://www.4clojure.com/problem/54"
  [ans]
  (and
    (= (ans 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
    (= (ans 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
    (= (ans 3 (range 8)) '((0 1 2) (3 4 5)))))

(defn q55
  "http://www.4clojure.com/problem/55"
  [ans]
  (and
    (= (ans [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
    (= (ans [:b :a :b :a :b]) {:a 2, :b 3})
    (= (ans '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})))
