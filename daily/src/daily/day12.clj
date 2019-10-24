(ns daily.day12)

(defn q107
  "http://www.4clojure.com/problem/107"
  [ans]
  (= 256 ((ans 2) 16) ((ans 8) 2))
  (= [1 8 27 64] (map (ans 3) [1 2 3 4]))
  (= [1 2 4 8 16] (map #((ans %) 2) [0 1 2 3 4])))

(defn q90
  "http://www.4clojure.com/problem/90"
  [ans]
  (= (ans #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
     #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
       ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
       ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]})
  (= (ans #{1 2 3} #{4 5})
     #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})
  (= 300 (count (ans (into #{} (range 10))
                    (into #{} (range 30))))))

(defn q88
  "http://www.4clojure.com/problem/88"
  [ans]
  (= (ans #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})
  (= (ans #{:a :b :c} #{}) #{:a :b :c})
  (= (ans #{} #{4 5 6}) #{4 5 6})
  (= (ans #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]}))
