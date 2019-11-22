(ns daily.day20)

(defn q134
  "http://www.4clojure.com/problem/134"
  [ans]
  (and
    (true?  (ans :a {:a nil :b 2}))
    (false? (ans :b {:a nil :b 2}))
    (false? (ans :c {:a nil :b 2}))))

(defn q162
  "http://www.4clojure.com/problem/162"
  [ans]
  (and
    (= ans (if-not false 1 0))
    (= ans (if-not nil 1 0))
    (= ans (if true 1 0))
    (= ans (if [] 1 0))
    (= ans (if [0] 1 0))
    (= ans (if 0 1 0))
    (= ans (if 1 1 0))))


(defn q161
  "http://www.4clojure.com/problem/161"
  [ans]
  (and
    (clojure.set/superset? ans #{2})
    (clojure.set/subset? #{1} ans)
    (clojure.set/superset? ans #{1 2})
    (clojure.set/subset? #{1 2} ans)))

(defn q156
  "http://www.4clojure.com/problem/156"
  [ans]
  (and
    (= (ans 0 [:a :b :c]) {:a 0 :b 0 :c 0})
    (= (ans "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})
    (= (ans [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})))

(defn q157
  "http://www.4clojure.com/problem/157"
  [ans]
  (and
    (= (ans [:a :b :c]) [[:a 0] [:b 1] [:c 2]])
    (= (ans [0 1 3]) '((0 0) (1 1) (3 2)))
    (= (ans [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]])))
