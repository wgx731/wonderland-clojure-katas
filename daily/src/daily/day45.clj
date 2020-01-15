(ns daily.day45)

(defn q171
  "http://www.4clojure.com/problem/171"
  [ans]
  (and
    (= (ans [1 2 3]) [[1 3]])
    (= (ans [10 9 8 1 2 3]) [[1 3] [8 10]])
    (= (ans [1 1 1 1 1 1 1]) [[1 1]])
    (= (ans []) [])
    (= (ans [19 4 17 1 3 10 2 13 13 2 16 4 2 15 13 9 6 14 2 11])
       [[1 4] [6 6] [9 11] [13 17] [19 19]])
    ))

(defn q177
  "http://www.4clojure.com/problem/177"
  [ans]
  (and
    (ans "This string has no brackets.")
    (ans "class Test {
      public static void main(String[] args) {
        System.out.println(\"Hello world.\");
      }
    }")
    (not (ans "(start, end]"))
    (not (ans "())"))
    (not (ans "[ { ] } "))
    (ans "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))")
    (not (ans "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))"))
    (not (ans "["))))

(defn q178
  "http://www.4clojure.com/problem/178"
  [ans]
  (and
    (= :high-card (ans ["HA" "D2" "H3" "C9" "DJ"]))
    (= :pair (ans ["HA" "HQ" "SJ" "DA" "HT"]))
    (= :two-pair (ans ["HA" "DA" "HQ" "SQ" "HT"]))
    (= :three-of-a-kind (ans ["HA" "DA" "CA" "HJ" "HT"]))
    (= :straight (ans ["HA" "DK" "HQ" "HJ" "HT"]))
    (= :straight (ans ["HA" "H2" "S3" "D4" "C5"]))
    (= :flush (ans ["HA" "HK" "H2" "H4" "HT"]))
    (= :full-house (ans ["HA" "DA" "CA" "HJ" "DJ"]))
    (= :four-of-a-kind (ans ["HA" "DA" "CA" "SA" "DJ"]))
    (= :straight-flush (ans ["HA" "HK" "HQ" "HJ" "HT"]))
    ))

(defn q168
  "http://www.4clojure.com/problem/168"
  [ans]
  (and
    (= (take 5 (map #(take 6 %) (ans str)))
       [["00" "01" "02" "03" "04" "05"]
        ["10" "11" "12" "13" "14" "15"]
        ["20" "21" "22" "23" "24" "25"]
        ["30" "31" "32" "33" "34" "35"]
        ["40" "41" "42" "43" "44" "45"]])
    (= (take 6 (map #(take 5 %) (ans str 3 2)))
       [["32" "33" "34" "35" "36"]
        ["42" "43" "44" "45" "46"]
        ["52" "53" "54" "55" "56"]
        ["62" "63" "64" "65" "66"]
        ["72" "73" "74" "75" "76"]
        ["82" "83" "84" "85" "86"]])
    (= (ans * 3 5 5 7)
       [[15 18 21 24 27 30 33]
        [20 24 28 32 36 40 44]
        [25 30 35 40 45 50 55]
        [30 36 42 48 54 60 66]
        [35 42 49 56 63 70 77]])
    (= (ans #(/ % (inc %2)) 1 0 6 4)
       [[1/1 1/2 1/3 1/4]
        [2/1 2/2 2/3 1/2]
        [3/1 3/2 3/3 3/4]
        [4/1 4/2 4/3 4/4]
        [5/1 5/2 5/3 5/4]
        [6/1 6/2 6/3 6/4]])
    (= (class (ans (juxt bit-or bit-xor)))
       (class (ans (juxt quot mod) 13 21))
       (class (lazy-seq)))
    (= (class (nth (ans (constantly 10946)) 34))
       (class (nth (ans (constantly 0) 5 8) 55))
       (class (lazy-seq)))
    (= (let [m 377 n 610 w 987
             check (fn [f s] (every? true? (map-indexed f s)))
             row (take w (nth (ans vector) m))
             column (take w (map first (ans vector m n)))
             diagonal (map-indexed #(nth %2 %) (ans vector m n w w))]
         (and (check #(= %2 [m %]) row)
              (check #(= %2 [(+ m %) n]) column)
              (check #(= %2 [(+ m %) (+ n %)]) diagonal)))
       true)))

(defn q92
  "http://www.4clojure.com/problem/92"
  [ans]
  (and
    (= 14 (ans "XIV"))
    (= 827 (ans "DCCCXXVII"))
    (= 3999 (ans "MMMCMXCIX"))
    (= 48 (ans "XLVIII"))
    ))

(defn q152
  "http://www.4clojure.com/problem/152"
  [ans]
  (and
    (= (ans '[[A B C D]
             [A C D B]
             [B A D C]
             [D C A B]])
       {})
    (= (ans '[[A B C D E F]
             [B C D E F A]
             [C D E F A B]
             [D E F A B C]
             [E F A B C D]
             [F A B C D E]])
       {6 1})
    (= (ans '[[A B C D]
             [B A D C]
             [D C B A]
             [C D A B]])
       {4 1, 2 4})
    (= (ans '[[B D A C B]
             [D A B C A]
             [A B C A B]
             [B C A B C]
             [A D B C A]])
       {3 3})
    (= (ans [  [2 4 6 3]
            [3 4 6 2]
            [6 2 4]  ])
       {})
    (= (ans [[1]
            [1 2 1 2]
            [2 1 2 1]
            [1 2 1 2]
            []       ])
       {2 2})
    (= (ans [[3 1 2]
            [1 2 3 1 3 4]
            [2 3 1 3]    ])
       {3 1, 2 2})
    (= (ans [[8 6 7 3 2 5 1 4]
            [6 8 3 7]
            [7 3 8 6]
            [3 7 6 8 1 4 5 2]
            [1 8 5 2 4]
            [8 1 2 4 5]])
       {4 1, 3 1, 2 7})
    ))
