(ns daily.day41)

(defn q115
  "http://www.4clojure.com/problem/115"
  [ans]
  (and
    (= true (ans 11))
    (= true (ans 121))
    (= false (ans 123))
    (= true (ans 0))
    (= false (ans 88099))
    (= true (ans 89098))
    (= true (ans 89098))
    (= true (ans 89089))
    (= (take 20 (filter ans (range)))
       [0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101])))

(defn q116
  "http://www.4clojure.com/problem/116"
  [ans]
  (and
    (= false (ans 4))
    (= true (ans 563))
    (= 1103 (nth (filter ans (range)) 15))))

(defn q117
  "http://www.4clojure.com/problem/117"
  [ans]
  (and
    (= true  (ans ["M   C"]))
    (= false (ans ["M # C"]))
    (= true  (ans ["#######"
                  "#     #"
                  "#  #  #"
                  "#M # C#"
                  "#######"]))
    (= false (ans ["########"
                  "#M  #  #"
                  "#   #  #"
                  "# # #  #"
                  "#   #  #"
                  "#  #   #"
                  "#  # # #"
                  "#  #   #"
                  "#  #  C#"
                  "########"]))
    (= false (ans ["M     "
                  "      "
                  "      "
                  "      "
                  "    ##"
                  "    #C"]))
    (= true  (ans ["C######"
                  " #     "
                  " #   # "
                  " #   #M"
                  "     # "]))
    (= true  (ans ["C# # # #"
                  "        "
                  "# # # # "
                  "        "
                  " # # # #"
                  "        "
                  "# # # #M"]))))

(defn q124
  "http://www.4clojure.com/problem/124"
  [ans]
  (and
    ( = {[1 3] #{[1 2]}, [0 2] #{[1 2]}, [3 1] #{[2 1]}, [2 0] #{[2 1]}}
    (ans '[[e e e e]
          [e w b e]
          [e b w e]
          [e e e e]] 'w))
    (= {[3 2] #{[2 2]}, [3 0] #{[2 1]}, [1 0] #{[1 1]}}
       (ans '[[e e e e]
             [e w b e]
             [w w w e]
             [e e e e]] 'b))
    (= {[0 3] #{[1 2]}, [1 3] #{[1 2]}, [3 3] #{[2 2]}, [2 3] #{[2 2]}}
       (ans '[[e e e e]
             [e w b e]
             [w w b e]
             [e e b e]] 'w))
    (= {[0 3] #{[2 1] [1 2]}, [1 3] #{[1 2]}, [2 3] #{[2 1] [2 2]}}
       (ans '[[e e w e]
             [b b w e]
             [b w w e]
             [b w w w]] 'b))))

(defn q125
  "http://www.4clojure.com/problem/125"
  []
  (and
    (= (str '(fn [x] (str x x)) '(fn [x] (str x x))) ((fn [x] (str x x)) '(fn [x] (str x x))))))
