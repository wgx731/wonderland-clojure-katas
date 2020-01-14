(ns daily.day44)

(defn q132
  "http://www.4clojure.com/problem/132"
  [ans]
  (and
    (= '(1 :less 6 :less 7 4 3) (ans < :less [1 6 7 4 3]))
    (= '(2) (ans > :more [2]))
    (= [0 1 :x 2 :x 3 :x 4]  (ans #(and (pos? %) (< % %2)) :x (range 5)))
    (empty? (ans > :more ()))
    (= [0 1 :same 1 2 3 :same 5 8 13 :same 21]
       (take 12 (->> [0 1]
                     (iterate (fn [[a b]] [b (+ a b)]))
                     (map first) ; fibonacci numbers
                     (ans (fn [a b] ; both even or both odd
                           (= (mod a 2) (mod b 2)))
                         :same))))))

(defn q140
  "http://www.4clojure.com/problem/140"
  [ans]
  (and
    (= (ans #{#{'a 'B 'C 'd}
             #{'A 'b 'c 'd}
             #{'A 'b 'c 'D}
             #{'A 'b 'C 'd}
             #{'A 'b 'C 'D}
             #{'A 'B 'c 'd}
             #{'A 'B 'c 'D}
             #{'A 'B 'C 'd}})
       #{#{'A 'c}
         #{'A 'b}
         #{'B 'C 'd}})
    (= (ans #{#{'A 'B 'C 'D}
             #{'A 'B 'C 'd}})
       #{#{'A 'B 'C}})
    (= (ans #{#{'a 'b 'c 'd}
             #{'a 'B 'c 'd}
             #{'a 'b 'c 'D}
             #{'a 'B 'c 'D}
             #{'A 'B 'C 'd}
             #{'A 'B 'C 'D}
             #{'A 'b 'C 'd}
             #{'A 'b 'C 'D}})
       #{#{'a 'c}
         #{'A 'C}})
    (= (ans #{#{'a 'b 'c}
             #{'a 'B 'c}
             #{'a 'b 'C}
             #{'a 'B 'C}})
       #{#{'a}})
    (= (ans #{#{'a 'B 'c 'd}
             #{'A 'B 'c 'D}
             #{'A 'b 'C 'D}
             #{'a 'b 'c 'D}
             #{'a 'B 'C 'D}
             #{'A 'B 'C 'd}})
       #{#{'a 'B 'c 'd}
         #{'A 'B 'c 'D}
         #{'A 'b 'C 'D}
         #{'a 'b 'c 'D}
         #{'a 'B 'C 'D}
         #{'A 'B 'C 'd}})
    (= (ans #{#{'a 'b 'c 'd}
             #{'a 'B 'c 'd}
             #{'A 'B 'c 'd}
             #{'a 'b 'c 'D}
             #{'a 'B 'c 'D}
             #{'A 'B 'c 'D}})
       #{#{'a 'c}
         #{'B 'c}})
    (= (ans #{#{'a 'B 'c 'd}
             #{'A 'B 'c 'd}
             #{'a 'b 'c 'D}
             #{'a 'b 'C 'D}
             #{'A 'b 'c 'D}
             #{'A 'b 'C 'D}
             #{'a 'B 'C 'd}
             #{'A 'B 'C 'd}})
       #{#{'B 'd}
         #{'b 'D}})
    (= (ans #{#{'a 'b 'c 'd}
             #{'A 'b 'c 'd}
             #{'a 'B 'c 'D}
             #{'A 'B 'c 'D}
             #{'a 'B 'C 'D}
             #{'A 'B 'C 'D}
             #{'a 'b 'C 'd}
             #{'A 'b 'C 'd}})
       #{#{'B 'D}
         #{'b 'd}})))

(defn q141
  "http://www.4clojure.com/problem/141"
  [ans]
  (and
    (let [notrump (ans nil)]
      (and (= {:suit :club :rank 9}  (notrump [{:suit :club :rank 4}
                                               {:suit :club :rank 9}]))
           (= {:suit :spade :rank 2} (notrump [{:suit :spade :rank 2}
                                               {:suit :club :rank 10}]))))
    (= {:suit :club :rank 10} ((ans :club) [{:suit :spade :rank 2}
                                           {:suit :club :rank 10}]))
    (= {:suit :heart :rank 8}
       ((ans :heart) [{:suit :heart :rank 6} {:suit :heart :rank 8}
                     {:suit :diamond :rank 10} {:suit :heart :rank 4}]))))

(defn q148
  "http://www.4clojure.com/problem/148"
  [ans]
  (and
    (= 0 (ans 3 17 11))
    (= 23 (ans 10 3 5))
    (= 233168 (ans 1000 3 5))
    (= "2333333316666668" (str (ans 100000000 3 5)))
    (= "110389610389889610389610"
       (str (ans (* 10000 10000 10000) 7 11)))
    (= "1277732511922987429116"
       (str (ans (* 10000 10000 10000) 757 809)))
    (= "4530161696788274281"
       (str (ans (* 10000 10000 1000) 1597 3571)))))

(defn q150
  "http://www.4clojure.com/problem/150"
  [ans]
  (and
    (= (take 26 (ans 0))
       [0 1 2 3 4 5 6 7 8 9
        11 22 33 44 55 66 77 88 99
        101 111 121 131 141 151 161])
    (= (take 16 (ans 162))
       [171 181 191 202
        212 222 232 242
        252 262 272 282
        292 303 313 323])
    (= (take 6 (ans 1234550000))
       [1234554321 1234664321 1234774321
        1234884321 1234994321 1235005321])
    (= (first (ans (* 111111111 111111111)))
       (* 111111111 111111111))
    (= (set (take 199 (ans 0)))
       (set (map #(first (ans %)) (range 0 10000))))
    (= true
       (apply < (take 6666 (ans 9999999))))
    (= (nth (ans 0) 10101)
       9102019)))
