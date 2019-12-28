(ns daily.day40)

(defn q75
  "http://www.4clojure.com/problem/75"
  [ans]
  (and
    (= (ans 1) 1)
    (= (ans 10) (count '(1 3 7 9)) 4)
    (= (ans 40) 16)
    (= (ans 99) 60)))

(defn q85
  "http://www.4clojure.com/problem/85"
  [ans]
  (and
    (= (ans #{1 :a}) #{#{1 :a} #{:a} #{} #{1}})
    (= (ans #{}) #{#{}})
    (= (ans #{1 2 3})
       #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}})
    (= (count (ans (into #{} (range 10)))) 1024)))

(defn q86
  "http://www.4clojure.com/problem/86"
  [ans]
  (and
    (= (ans 7) true)
    (= (ans 986543210) true)
    (= (ans 2) false)
    (= (ans 3) false)))

(defn q89
  "http://www.4clojure.com/problem/89"
  [ans]
  (and
    (= true (ans [[:a :b]]))
    (= false (ans [[:a :a] [:b :b]]))
    (= false (ans [[:a :b] [:a :b] [:a :c] [:c :a]
                  [:a :d] [:b :d] [:c :d]]))
    (= true (ans [[1 2] [2 3] [3 4] [4 1]]))
    (= true (ans [[:a :b] [:a :c] [:c :b] [:a :e]
                 [:b :e] [:a :d] [:b :d] [:c :e]
                 [:d :e] [:c :f] [:d :f]]))
    (= false (ans [[1 2] [2 3] [2 4] [2 5]]))))

(defn q91
  "http://www.4clojure.com/problem/91"
  [ans]
  (and
    (= true (ans #{[:a :a]}))
    (= true (ans #{[:a :b]}))
    (= false (ans #{[1 2] [2 3] [3 1]
                   [4 5] [5 6] [6 4]}))
    (= true (ans #{[1 2] [2 3] [3 1]
                  [4 5] [5 6] [6 4] [3 4]}))
    (= false (ans #{[:a :b] [:b :c] [:c :d]
                   [:x :y] [:d :a] [:b :e]}))
    (= true (ans #{[:a :b] [:b :c] [:c :d]
                  [:x :y] [:d :a] [:b :e] [:x :a]}))))
