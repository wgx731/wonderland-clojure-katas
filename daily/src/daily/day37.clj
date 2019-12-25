(ns daily.day37)

(defn q59
  "http://www.4clojure.com/problem/59"
  [ans]
  (and
    (= [21 6 1] ((ans + max min) 2 3 5 1 6 4))
    (= ["HELLO" 5] ((ans #(.toUpperCase %) count) "hello"))
    (= [2 6 4] ((ans :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))))

(defn q60
  "http://www.4clojure.com/problem/60"
  [ans]
  (and
    (= (take 5 (ans + (range))) [0 1 3 6 10])
    (= (ans conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])
    (= (last (ans * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)))

(defn q70
  "http://www.4clojure.com/problem/70"
  [ans]
  (and
    (= (ans  "Have a nice day.")
       ["a" "day" "Have" "nice"])
    (= (ans  "Clojure is a fun language!")
       ["a" "Clojure" "fun" "is" "language"])
    (= (ans  "Fools fall for foolish follies.")
       ["fall" "follies" "foolish" "Fools" "for"])))

(defn q73
  "http://www.4clojure.com/problem/73"
  [ans]
  (and
    (= nil (ans [[:e :e :e]
                [:e :e :e]
                [:e :e :e]]))
    (= :x (ans [[:x :e :o]
               [:x :e :e]
               [:x :e :o]]))
    (= :o (ans [[:e :x :e]
              [:o :o :o]
              [:x :e :x]]))
    (= nil (ans [[:x :e :o]
                [:x :x :e]
                [:o :x :o]]))
    (= :x (ans [[:x :e :e]
               [:o :x :e]
               [:o :e :x]]))
    (= :o (ans [[:x :e :o]
               [:x :o :e]
               [:o :e :x]]))
    (= nil (ans [[:x :o :x]
                [:x :o :x]
                [:o :x :o]]))))

(defn q74
  "http://www.4clojure.com/problem/74"
  [ans]
  (and
    (= (ans "4,5,6,7,8,9") "4,9")
    (= (ans "15,16,25,36,37") "16,25,36")))

