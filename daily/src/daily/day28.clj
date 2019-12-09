(ns daily.day28)

(defn q126
  "http://www.4clojure.com/problem/126"
  [ans]
    (let [x ans]
      (and (= (class x) x) x)))

(defn q135
  "http://www.4clojure.com/problem/135"
  [ans]
  (and
    (= 7  (ans 2 + 5))
    (= 42 (ans 38 + 48 - 2 / 2))
    (= 8  (ans 10 / 2 - 1 * 2))
    (= 72 (ans 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))))

(defn q137
  "http://www.4clojure.com/problem/137"
  [ans]
  (and
    (= [1 2 3 4 5 0 1] (ans 1234501 10))
    (= [0] (ans 0 11))
    (= [1 0 0 1] (ans 9 2))
    (= [1 0] (let [n (rand-int 100000)](ans n n)))
    (= [16 18 5 24 15 1] (ans Integer/MAX_VALUE 42))))


(defn q138
  "http://www.4clojure.com/problem/138"
  [ans]
  (and
    (= (ans 2 2) ["2"])
    (= (ans 2 4) [" 2 "
                 "* 4"
                 " * "])
    (= (ans 3 81) [" 3 "
                  "1 9"
                  " 8 "])
    (= (ans 4 20) [" 4 "
                  "* 1"
                  " 6 "])
    (= (ans 2 256) ["  6  "
                   " 5 * "
                   "2 2 *"
                   " 6 4 "
                   "  1  "])
    (= (ans 10 10000) ["   0   "
                      "  1 0  "
                      " 0 1 0 "
                      "* 0 0 0"
                      " * 1 * "
                      "  * *  "
                      "   *   "])))

