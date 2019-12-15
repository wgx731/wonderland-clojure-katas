(ns daily.day31)

(defn q118
  "http://www.4clojure.com/problem/118"
  [ans]
  (and
    (= [3 4 5 6 7]
       (ans inc [2 3 4 5 6]))
    (= (repeat 10 nil)
       (ans (fn [_] nil) (range 10)))
    (= [1000000 1000001]
       (->> (ans inc (range))
            (drop (dec 1000000))
            (take 2)))))

(defn q119
  "http://www.4clojure.com/problem/119"
  [ans]
  (and
    (= (ans :x [[:o :e :e]
               [:o :x :o]
               [:x :x :e]])
       #{[2 2] [0 1] [0 2]})
    (= (ans :x [[:x :o :o]
               [:x :x :e]
               [:e :o :e]])
       #{[2 2] [1 2] [2 0]})
    (= (ans :x [[:x :e :x]
               [:o :x :o]
               [:e :o :e]])
       #{[2 2] [0 1] [2 0]})
    (= (ans :x [[:x :x :o]
               [:e :e :e]
               [:e :e :e]])
       #{})
    (= (ans :o [[:x :x :o]
               [:o :e :o]
               [:x :e :e]])
       #{[2 2] [1 1]})))
