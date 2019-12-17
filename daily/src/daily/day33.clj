(ns daily.day33)

(defn q128
  "http://www.4clojure.com/problem/128"
  [ans]
  (and
    (= {:suit :diamond :rank 10} (ans "DQ"))
    (= {:suit :heart :rank 3} (ans "H5"))
    (= {:suit :club :rank 12} (ans "CA"))
    (= (range 13) (map (comp :rank ans str)
                       '[S2 S3 S4 S5 S6 S7
                         S8 S9 ST SJ SQ SK SA]))))

(defn q130
  "http://www.4clojure.com/problem/130"
  [ans]
  (and
    (= '(n)
       (ans 'n '(n)))
    ( = '(a (t (e)))
    (ans 'a '(t (e) (a))))
    (= '(e (t (a)))
       (ans 'e '(a (t (e)))))
    (= '(d
          (b
            (c)
            (e)
            (a
              (f
                (g)
                (h)))))
       (ans 'd '(a
                 (b
                   (c)
                   (d)
                   (e))
                 (f
                   (g)
                   (h)))))

    (= '(c
          (d)
          (e)
          (b
            (f
              (g)
              (h))
            (a
              (i
                (j
                  (k)
                  (l))
                (m
                  (n)
                  (o))))))
       (ans 'c '(a
                 (b
                   (c
                     (d)
                     (e))
                   (f
                     (g)
                     (h)))
                 (i
                   (j
                     (k)
                     (l))
                   (m
                     (n)
                     (o))))))))

(defn q131
  "http://www.4clojure.com/problem/131"
  [ans]
  (and
    (= true  (ans #{-1 1 99}
                #{-2 2 888}
                #{-3 3 7777}))
    (= false (ans #{1}
                 #{2}
                 #{3}
                 #{4}))
    (= true  (ans #{1}))
    (= false (ans #{1 -3 51 9}
                 #{0}
                 #{9 2 81 33}))
    (= true  (ans #{1 3 5}
                 #{9 11 4}
                 #{-3 12 3}
                 #{-3 4 -2 10}))
    (= false (ans #{-1 -2 -3 -4 -5 -6}
                 #{1 2 3 4 5 6 7 8 9}))
    (= true  (ans #{1 3 5 7}
                 #{2 4 6 8}))
    (= true  (ans #{-1 3 -5 7 -9 11 -13 15}
                 #{1 -3 5 -7 9 -11 13 -15}
                 #{1 -1 2 -2 4 -4 8 -8}))
    (= true  (ans #{-10 9 -8 7 -6 5 -4 3 -2 1}
                 #{10 -9 8 -7 6 -5 4 -3 2 -1}))))
