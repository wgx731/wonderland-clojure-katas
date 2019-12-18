(ns daily.day34)

(def q173
  "http://www.4clojure.com/problem/173"
    (= 3
       (let [[ops a] [+ (range 3)]] (apply ops a))
       (let [[[ops a] b] [[+ 1] 2]] (ops a b))
       (let [[ops a] [inc 2]] (ops a))))

