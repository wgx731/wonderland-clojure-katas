(ns daily.day9)

(defn q26
  "http://www.4clojure.com/problem/26"
  [ans]
  (and
    (= (ans 3) '(1 1 2))
    (= (ans 6) '(1 1 2 3 5 8))
    (= (ans 8) '(1 1 2 3 5 8 13 21))))

(defn q29
  "http://www.4clojure.com/problem/29"
  [ans]
  (and
    (= (ans "HeLlO, WoRlD!") "HLOWRD")
    (empty? (ans "nothing"))
    (= (ans "$#A(*&987Zf") "AZ")))