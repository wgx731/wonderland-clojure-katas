(ns daily.day17)

(defn q35
  "http://www.4clojure.com/problem/35"
  [ans]
  (and
    (= ans (let [x 5] (+ 2 x)))
    (= ans (let [x 3, y 10] (- y x)))
    (= ans (let [x 21] (let [y 3] (/ x y))))))

(defn q36
  "http://www.4clojure.com/problem/36"
  [_]
  (and
    (= 10 (let [z 1 y 3 x 7] (+ x y)))
    (= 4 (let [z 1 y 3 x 7] (+ y z)))
    (= 1 (let [z 1 y 3 x 7] z))))

(defn q38
  "http://www.4clojure.com/problem/38"
  [ans]
  (and
    (= (ans 1 8 3 4) 8)
    (= (ans 30 20) 30)
    (= (ans 45 67 11) 67)))

(defn q39
  "http://www.4clojure.com/problem/39"
  [ans]
  (and
    (= (ans [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
    (= (ans [1 2] [3 4 5 6]) '(1 3 2 4))
    (= (ans [1 2 3 4] [5]) [1 5])
    (= (ans [30 20] [25 15]) [30 25 20 15])))

(defn q40
  "http://www.4clojure.com/problem/40"
  [ans]
  (and
    (= (ans 0 [1 2 3]) [1 0 2 0 3])
    (= (apply str (ans ", " ["one" "two" "three"])) "one, two, three")
    (= (ans :z [:a :b :c :d]) [:a :z :b :z :c :z :d])))
