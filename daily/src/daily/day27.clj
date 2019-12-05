(ns daily.day27)

(defn q122
  "http://www.4clojure.com/problem/122"
  [ans]
  (and
    (= 0     (ans "0"))
    (= 7     (ans "111"))
    (= 8     (ans "1000"))
    (= 9     (ans "1001"))
    (= 255   (ans "11111111"))
    (= 1365  (ans "10101010101"))
    (= 65535 (ans "1111111111111111"))))

