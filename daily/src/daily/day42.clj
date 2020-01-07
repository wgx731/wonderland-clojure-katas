(ns daily.day42)

(defn q98
  "http://www.4clojure.com/problem/98"
  [ans]
  (and
    (= (ans #(* % %) #{-2 -1 0 1 2})
       #{#{0} #{1 -1} #{2 -2}})
    (= (ans #(rem % 3) #{0 1 2 3 4 5 })
       #{#{0 3} #{1 4} #{2 5}})
    (= (ans identity #{0 1 2 3 4})
       #{#{0} #{1} #{2} #{3} #{4}})
    (= (ans (constantly true) #{0 1 2 3 4})
       #{#{0 1 2 3 4}})))

(defn q108
  "http://www.4clojure.com/problem/108"
  [ans]
  (and
    (= 3 (ans [3 4 5]))
    (= 4 (ans [1 2 3 4 5 6 7] [0.5 3/2 4 19]))
    (= 7 (ans (range) (range 0 100 7/6) [2 3 5 7 11 13]))
    (= 64 (ans (map #(* % % %) (range)) ;; perfect cubes
              (filter #(zero? (bit-and % (dec %))) (range)) ;; powers of 2
              (iterate inc 20))) ;; at least as large as 20
    ))

(defn q110
  "http://www.4clojure.com/problem/110"
  [ans]
  (and
    (= [[1 1] [2 1] [1 2 1 1]] (take 3 (ans [1])))
    (= [3 1 2 4] (first (ans [1 1 1 4 4])))
    (= [1 1 1 3 2 1 3 2 1 1] (nth (ans [1]) 6))
    (= 338 (count (nth (ans [3 2]) 15)))))

(defn q111
  "http://www.4clojure.com/problem/111"
  [ans]
  (and
    (= true  (ans "the" ["_ # _ _ e"]))
    (= false (ans "the" ["c _ _ _"
                        "d _ # e"
                        "r y _ _"]))
    (= true  (ans "joy" ["c _ _ _"
                        "d _ # e"
                        "r y _ _"]))
    (= false (ans "joy" ["c o n j"
                        "_ _ y _"
                        "r _ _ #"]))
    (= true  (ans "clojure" ["_ _ _ # j o y"
                            "_ _ o _ _ _ _"
                            "_ _ f _ # _ _"]))))

(defn q112
  "http://www.4clojure.com/problem/112"
  [ans]
  (and
    (= (ans 10 [1 2 [3 [4 5] 6] 7])
       '(1 2 (3 (4))))
    (= (ans 30 [1 2 [3 [4 [5 [6 [7 8]] 9]] 10] 11])
       '(1 2 (3 (4 (5 (6 (7)))))))
    (= (ans 9 (range))
       '(0 1 2 3))
    (= (ans 1 [[[[[1]]]]])
       '(((((1))))))
    (= (ans 0 [1 2 [3 [4 5] 6] 7])
       '())
    (= (ans 0 [0 0 [0 [0]]])
       '(0 0 (0 (0))))
    (= (ans 1 [-10 [1 [2 3 [4 5 [6 7 [8]]]]]])
        '(-10 (1 (2 3 (4)))))))
