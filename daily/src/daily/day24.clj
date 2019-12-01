(ns daily.day24)

(defn q81
  "http://www.4clojure.com/problem/81"
  [ans]
  (and
    (= (ans #{0 1 2 3} #{2 3 4 5}) #{2 3})
    (= (ans #{0 1 2} #{3 4 5}) #{})
    (= (ans #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})))


(defn q82
  "http://www.4clojure.com/problem/82"
  [ans]
  (and
    (= true (ans #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"}))
    (= false (ans #{"cot" "hot" "bat" "fat"}))
    (= false (ans #{"to" "top" "stop" "tops" "toss"}))
    (= true (ans #{"spout" "do" "pot" "pout" "spot" "dot"}))
    (= true (ans #{"share" "hares" "shares" "hare" "are"}))
    (= false (ans #{"share" "hares" "hare" "are"}))))

(defn q166
  "http://www.4clojure.com/problem/166"
  [ans]
  (and
    (= :gt (ans < 5 1))
    (= :eq (ans (fn [x y] (< (count x) (count y))) "pear" "plum"))
    (= :lt (ans (fn [x y] (< (mod x 5) (mod y 5))) 21 3))
    (= :gt (ans > 0 2))))
