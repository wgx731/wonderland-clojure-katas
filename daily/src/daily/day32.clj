(ns daily.day32)

(defn q120
  "http://www.4clojure.com/problem/120"
  [ans]
  (and
    (= 8 (ans (range 10)))
    (= 19 (ans (range 30)))
    (= 50 (ans (range 100)))
    (= 50 (ans (range 1000)))))

(defn q121
  "http://www.4clojure.com/problem/121"
  [ans]
  (and
    (= 2 ((ans '(/ a b))
          '{b 8 a 16}))
    (= 8 ((ans '(+ a b 2))
          '{a 2 b 4}))
    (= [6 0 -4]
       (map (ans '(* (+ 2 a)
                    (- 10 b)))
            '[{a 1 b 8}
              {b 5 a -2}
              {a 2 b 11}]))
    (= 1 ((ans '(/ (+ x 2)
                  (* 3 (+ y 1))))
          '{x 4 y 1}))))

