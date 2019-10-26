(ns daily.day14)

(defn q95
  "http://www.4clojure.com/problem/95"
  [ans]
  (= (ans '(:a (:b nil nil) nil)) true)
  (= (ans '(:a (:b nil nil))) false)
  (= (ans [1 nil [2 [3 nil nil] [4 nil nil]]]) true)
  (= (ans [1 [2 nil nil] [3 nil nil] [4 nil nil]]) false)
  (= (ans [1 [2 [3 [4 nil nil] nil] nil] nil]) true)
  (= (ans [1 [2 [3 [4 false nil] nil] nil] nil]) false)
  (= (ans '(:a nil ())) false))

(defn q96
  "http://www.4clojure.com/problem/96"
  [ans]
  (= (ans '(:a (:b nil nil) (:b nil nil))) true)
  (= (ans '(:a (:b nil nil) nil)) false)
  (= (ans '(:a (:b nil nil) (:c nil nil))) false)
  (= (ans [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])
     true)
  (= (ans [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])
     false)
  (= (ans [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [6 nil nil] nil]] nil]])
     false))
