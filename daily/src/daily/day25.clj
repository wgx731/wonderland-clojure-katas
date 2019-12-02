(ns daily.day25)

(defn q99
  "http://www.4clojure.com/problem/99"
  [ans]
  (and
    (= (ans 1 1) [1])
    (= (ans 99 9) [8 9 1])
    (= (ans 999 99) [9 8 9 0 1])))

(defn q101
  "http://www.4clojure.com/problem/101"
  [ans]
  (and
    (= (ans "kitten" "sitting") 3)
    (= (ans "closure" "clojure") (ans "clojure" "closure") 1)
    (= (ans "xyx" "xyyyx") 2)
    (= (ans "" "123456") 6)
    (= (ans "Clojure" "Clojure") (ans "" "") (ans [] []) 0)
    (= (ans [1 2 3 4] [0 2 3 4 5]) 2)
    (= (ans '(:a :b :c :d) '(:a :d)) 2)
    (= (ans "ttttattttctg" "tcaaccctaccat") 10)
    (= (ans "gaattctaatctc" "caaacaaaaaattt") 9)))



