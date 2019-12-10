(ns daily.day29)

(defn q195
  "http://www.4clojure.com/problem/195"
  [ans]
  (and
    (= [#{""} #{"()"} #{"()()" "(())"}] (map (fn [n] (ans n)) [0 1 2]))
    (= #{"((()))" "()()()" "()(())" "(())()" "(()())"} (ans 3))
    (= 16796 (count (ans 10)))
    (= (nth (sort (filter #(.contains ^String % "(()()()())") (ans 9))) 6) "(((()()()())(())))")
    (= (nth (sort (ans 12)) 5000) "(((((()()()()()))))(()))")))
