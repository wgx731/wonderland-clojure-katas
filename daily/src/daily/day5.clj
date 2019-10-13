(ns daily.day5
  (:require [clojure.set]))

(defn q37
  "http://www.4clojure.com/problem/37"
  [ans]
  (= ans (apply str (re-seq #"[A-Z]+" "bA1B3Ce "))))

(defn q57
  "http://www.4clojure.com/problem/57"
  [ans]
  (= ans ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5)))

(defn q68
  "http://www.4clojure.com/problem/68"
  [ans]
  (= ans
     (loop [x 5
            result []]
       (if (> x 0)
         (recur (dec x) (conj result (+ 2 x)))
         result))))

(defn q71
  "http://www.4clojure.com/problem/71"
  [ans]
  (= (ans (sort (rest (reverse [2 5 4 1 3 6]))))
     (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (ans))
     5))

(defn q72
  "http://www.4clojure.com/problem/72"
  [ans]
  (= (ans (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
     (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (ans))
     11))

(defn q145
  "http://www.4clojure.com/problem/145"
  [ans]
  (and
    (= ans (for [x (range 40)
                :when (= 1 (rem x 4))]
            x))
    (= ans (for [x (iterate #(+ 4 %) 0)
                :let [z (inc x)]
                :while (< z 40)]
            z))
    (= ans (for [[x y] (partition 2 (range 20))]
            (+ x y)))
    ))
