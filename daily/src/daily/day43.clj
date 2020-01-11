(ns daily.day43)

(defn q93
  "http://www.4clojure.com/problem/93"
  [ans]
  (and
    (= (ans [["Do"] ["Nothing"]])
       [["Do"] ["Nothing"]])
    (= (ans [[[[:a :b]]] [[:c :d]] [:e :f]])
       [[:a :b] [:c :d] [:e :f]])
    (= (ans '((1 2)((3 4)((((5 6)))))))
       '((1 2)(3 4)(5 6)))))

(defn q94
  "http://www.4clojure.com/problem/94"
  [ans]
  (and
    (= (ans ["      "
            " ##   "
            " ##   "
            "   ## "
            "   ## "
            "      "])
       ["      "
        " ##   "
        " #    "
        "    # "
        "   ## "
        "      "])
    (= (ans ["     "
            "     "
            " ### "
            "     "
            "     "])
       ["     "
        "  #  "
        "  #  "
        "  #  "
        "     "])
    (= (ans ["      "
            "      "
            "  ### "
            " ###  "
            "      "
            "      "])
       ["      "
        "   #  "
        " #  # "
        " #  # "
        "  #   "
        "      "])))

(defn q113
  "http://www.4clojure.com/problem/113"
  [ans]
  (and
    (= "1, 2, 3" (str (ans 2 1 3)))
    (= '(2 1 3) (seq (ans 2 1 3)))
    (= '(2 1 3) (seq (ans 2 1 3 3 1 2)))
    (= '(1) (seq (apply ans (repeat 5 1))))
    (= "1, 1, 1, 1, 1" (str (apply ans (repeat 5 1))))
    (and (= nil (seq (ans)))
         (=  "" (str (ans))))))

(defn q114
  "http://www.4clojure.com/problem/114"
  [ans]
  (and
    (= [2 3 5 7 11 13]
       (ans 4 #(= 2 (mod % 3))
           [2 3 5 7 11 13 17 19 23]))
    (= ["this" "is" "a" "sentence"]
       (ans 3 #(some #{\i} %)
           ["this" "is" "a" "sentence" "i" "wrote"]))
    (= ["this" "is"]
       (ans 1 #{"a"}
           ["this" "is" "a" "sentence" "i" "wrote"]))))

(defn q127
  "http://www.4clojure.com/problem/127"
  [ans]
  (and
    (= 10 (ans [15 15 15 15 15]))
    (= 15 (ans [1 3 7 15 31]))
    (= 3 (ans [3 3]))
    (= 4 (ans [7 3]))
    (= 6 (ans [17 22 6 14 22]))
    (= 9 (ans [18 7 14 14 6 3]))
    (= nil (ans [21 10 21 10]))
    (= nil (ans [0 31 0 31 0]))))
