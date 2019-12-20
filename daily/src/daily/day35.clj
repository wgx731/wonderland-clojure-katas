(ns daily.day35)

(defn q147
  "http://www.4clojure.com/problem/147"
  [ans]
  (and
    (= (second (ans [2 3 2])) [2 5 5 2])
    (= (take 5 (ans [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]])
    (= (take 2 (ans [3 1 2])) [[3 1 2] [3 4 3 2]])
    (= (take 100 (ans [2 4 2])) (rest (take 101 (ans [2 2]))))))

(defn q153
  "http://www.4clojure.com/problem/153"
  [ans]
  (and
    (= (ans #{#{\U} #{\s} #{\e \R \E} #{\P \L} #{\.}})
       true)
    (= (ans #{#{:a :b :c :d :e}
             #{:a :b :c :d}
             #{:a :b :c}
             #{:a :b}
             #{:a}})
       false)
    (= (ans #{#{[1 2 3] [4 5]}
             #{[1 2] [3 4 5]}
             #{[1] [2] 3 4 5}
             #{1 2 [3 4] [5]}})
       true)
    (= (ans #{#{'(:x :y :z) '(:x :y) '(:z) '()}
             #{#{:x :y :z} #{:x :y} #{:z} #{}}
             #{'[:x :y :z] [:x :y] [:z] [] {}}})
       false)
    (= (ans #{#{(= "true") false}
             #{:yes :no}
             #{(class 1) 0}
             #{(symbol "true") 'false}
             #{(keyword "yes") ::no}
             #{(class '1) (int \0)}})
       false)
    (= (ans #{#{distinct?}
             #{#(-> %) #(-> %)}
             #{#(-> %) #(-> %) #(-> %)}
             #{#(-> %) #(-> %) #(-> %)}})
       true)
    (= (ans #{#{(#(-> *)) + (quote mapcat) #_ nil}
             #{'+ '* mapcat (comment mapcat)}
             #{(do) set contains? nil?}
             #{, , , #_, , empty?}})
       false)))

