(ns daily.day39)

(defn q102
  "http://www.4clojure.com/problem/102"
  [ans]
  (and
    (= (ans "something") "something")
    (= (ans "multi-word-key") "multiWordKey")
    (= (ans "leaveMeAlone") "leaveMeAlone")))

(defn q103
  "http://www.4clojure.com/problem/103"
  [ans]
  (and
    (= (ans 1 #{4 5 6}) #{#{4} #{5} #{6}})
    (= (ans 10 #{4 5 6}) #{})
    (= (ans 2 #{0 1 2}) #{#{0 1} #{0 2} #{1 2}})
    (= (ans 3 #{0 1 2 3 4}) #{#{0 1 2} #{0 1 3} #{0 1 4} #{0 2 3} #{0 2 4}
                             #{0 3 4} #{1 2 3} #{1 2 4} #{1 3 4} #{2 3 4}})
    (= (ans 4 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a "abc" "efg"}})
    (= (ans 2 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a}
                                          #{[1 2 3] "abc"}
                                          #{[1 2 3] "efg"}
                                          #{:a "abc"}
                                          #{:a "efg"}
                                          #{"abc" "efg"}})))

(defn q104
  "http://www.4clojure.com/problem/104"
  [ans]
  (and
    (= "I" (ans 1))
    (= "XXX" (ans 30))
    (= "IV" (ans 4))
    (= "CXL" (ans 140))
    (= "DCCCXXVII" (ans 827))
    (= "MMMCMXCIX" (ans 3999))
    (= "XLVIII" (ans 48))))

(defn q105
  "http://www.4clojure.com/problem/105"
  [ans]
  (and
    (= {} (ans []))
    (= {:a [1]} (ans [:a 1]))
    (= {:a [1], :b [2]} (ans [:a 1, :b 2]))
    (= {:a [1 2 3], :b [], :c [4]} (ans [:a 1 2 3 :b :c 4]))))

(defn q106
  "http://www.4clojure.com/problem/106"
  [ans]
  (and
    (= 1 (ans 1 1))
    (= 3 (ans 3 12))
    (= 3 (ans 12 3))
    (= 3 (ans 5 9))
    (= 9 (ans 9 2))
    (= 5 (ans 9 12))))
