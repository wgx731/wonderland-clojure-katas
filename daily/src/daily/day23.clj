(ns daily.day23)

(defn q61
  "http://www.4clojure.com/problem/61"
  [ans]
  (and
    (= (ans [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
    (= (ans [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
    (= (ans [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})))

(defn q62
  "http://www.4clojure.com/problem/62"
  [ans]
  (and
    (= (take 5 (ans #(* 2 %) 1)) [1 2 4 8 16])
    (= (take 100 (ans inc 0)) (take 100 (range)))
    (= (take 9 (ans #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))))

(defn q63
  "http://www.4clojure.com/problem/63"
  [ans]
  (and
    (= (ans #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})
    (= (ans #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
       {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})
    (= (ans count [[1] [1 2] [3] [1 2 3] [2 3]])
       {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})))

(defn q65
  "http://www.4clojure.com/problem/65"
  [ans]
  (and
    (= :map (ans {:a 1, :b 2}))
    (= :list (ans (range (rand-int 20))))
    (= :vector (ans [1 2 3 4 5 6]))
    (= :set (ans #{10 (rand-int 5)}))
    (= [:map :set :vector :list] (map ans [{} #{} [] ()]))))

(defn q69
  "http://www.4clojure.com/problem/69"
  [ans]
  (and
    (= (ans * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
       {:a 4, :b 6, :c 20})
    (= (ans - {1 10, 2 20} {1 3, 2 10, 3 15})
       {1 7, 2 10, 3 15})
    (= (ans concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
       {:a [3 4 5], :b [6 7], :c [8 9]})))
