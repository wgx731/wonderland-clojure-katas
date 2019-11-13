(ns daily.day18)

(defn q47
  "http://www.4clojure.com/problem/47"
  [ans]
  (and
    (contains? #{4 5 6} ans)
    (contains? [1 1 1 1 1] ans)
    (contains? {4 :a 2 :b} ans)
    (not (contains? [1 2 4] ans))))

(defn q49
  "http://www.4clojure.com/problem/49"
  [ans]
  (and
    (= (ans 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
    (= (ans 1 [:a :b :c :d]) [[:a] [:b :c :d]])
    (= (ans 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])))
