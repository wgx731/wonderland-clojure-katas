(ns daily.day38)

(defn q76
  "http://www.4clojure.com/problem/76"
  [ans]
  (and
    (= ans
       (letfn
         [(foo [x y] #(bar (conj x y) y))
          (bar [x y] (if (> (last x) 10)
                       x
                       #(foo x (+ 2 y))))]
         (trampoline foo [] 1)))))

(defn q78
  "http://www.4clojure.com/problem/78"
  [ans]
  (and
    (= (letfn [(triple [x] #(sub-two (* 3 x)))
               (sub-two [x] #(stop?(- x 2)))
               (stop? [x] (if (> x 50) x #(triple x)))]
         (ans triple 2))
       82)
    (= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
               (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
         (map (partial ans my-even?) (range 6)))
       [true false true false true false])))

(defn q79
  "http://www.4clojure.com/problem/79"
  [ans]
  (and
    (= 7 (ans '([1]
                [2 4]
                [5 1 4]
                [2 3 4 5])))
    (= 20 (ans '([3]
                 [2 4]
                 [1 9 3]
                 [9 9 2 4]
                 [4 6 6 7 8]
                 [5 7 3 5 1 4])))))

(defn q80
  "http://www.4clojure.com/problem/80"
  [ans]
  (and
    (= (ans 6) true)
    (= (ans 7) false)
    (= (ans 496) true)
    (= (ans 500) false)
    (= (ans 8128) true)))

(defn q84
  "http://www.4clojure.com/problem/84"
  [ans]
  (and
    (let [divides #{[8 4] [9 3] [4 2] [27 9]}]
      (= (ans divides) #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]}))
    (let [more-legs
          #{["cat" "man"] ["man" "snake"] ["spider" "cat"]}]
      (= (ans more-legs)
         #{["cat" "man"] ["cat" "snake"] ["man" "snake"]
           ["spider" "cat"] ["spider" "man"] ["spider" "snake"]}))
    (let [progeny
          #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]}]
      (= (ans progeny)
         #{["father" "son"] ["father" "grandson"]
           ["uncle" "cousin"] ["son" "grandson"]}))))
