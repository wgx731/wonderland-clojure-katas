(ns daily.day16)

(defn q50
  "http://www.4clojure.com/problem/50"
  [ans]
  (and
    (= (set (ans [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})
    (= (set (ans [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})
    (= (set (ans [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})))

(defn q67
  "http://www.4clojure.com/problem/67"
  [ans]
  (and
    (= (ans 2) [2 3])
    (= (ans 5) [2 3 5 7 11])
    (= (last (ans 100)) 541)))

(defn q77
  "http://www.4clojure.com/problem/77"
  [ans]
  (and
    (= (ans ["meat" "mat" "team" "mate" "eat"])
       #{#{"meat" "team" "mate"}})
    (= (ans ["veer" "lake" "item" "kale" "mite" "ever"])
       #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})))

