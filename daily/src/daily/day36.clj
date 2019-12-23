(ns daily.day36)

(defn q56
  "http://www.4clojure.com/problem/56"
  [ans]
  (and
    (= (ans [1 2 1 3 1 2 4]) [1 2 3 4])
    (= (ans [:a :a :b :b :c :c]) [:a :b :c])
    (= (ans '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))
    (= (ans (range 50)) (range 50))))

(defn q58
  "http://www.4clojure.com/problem/58"
  [ans]
  (and
    (= [3 2 1] ((ans rest reverse) [1 2 3 4]))
    (= 5 ((ans (partial + 3) second) [1 2 3 4]))
    (= true ((ans zero? #(mod % 8) +) 3 5 7 9))
    (= "HELLO" ((ans #(.toUpperCase %) #(apply str %) take) 5 "hello world"))))

