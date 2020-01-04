(ns daily.day41-test
  (:require [clojure.test :refer :all]
            [daily.day41 :refer :all]))

(deftest q115-test
  (testing "q115 should pass"
    (is (= (q115 (fn b [n]
                   (let [col (map (comp read-string str) (str n))]
                     (letfn [(sum [x]
                               (apply + (take (quot (count x) 2) x)))]
                       (= (sum col) (sum (reverse col))))))) true))))

(deftest q116-test
  (testing "q116 should pass"
    (is (= (q116 (fn [x]
                   (let [not-prime? (fn [v] (some #(zero? (mod v %)) (range 2 v)))
                         get-prime #(loop [v (% x)]
                                      (if (not-prime? v) (recur (% v)) v))]
                     (and (< 2 x)
                          ((complement not-prime?) x)
                          (= x (/ (apply + (map get-prime [inc dec])) 2)))))) true))))

(deftest q117-test
  (testing "q117 should pass"
    (is (= (q117 (fn
                   science-bitch ;jesse pinkman (c)
                   [s]
                   (let [mice-c \M
                         cheese-c \C
                         wall-c \#
                         rows-count (count s)
                         columns-count (count (first s))
                         indexed-space (mapcat identity (map-indexed (fn [i1 v1] (map-indexed (fn [i2 v2] (vector v2 i1 i2)) v1)) (map seq s)))
                         broad (map (fn [[_ x y]] (vector x y)) (filter #(= (first %) wall-c) indexed-space))
                         mice (map (fn [[_ x y]] (vector x y)) (filter #(= (first %) mice-c) indexed-space))
                         cheese (first (map (fn [[_ x y]] (vector x y)) (filter #(= (first %) cheese-c) indexed-space)))
                         neighbours [[-1 0] [0 -1] [1 0] [0 1]]
                         get-neighbours (fn [current not-include] (filter (fn [[x y]] (and (> x -1) (> y -1) (< x rows-count) (< y columns-count) (nil? (some (fn [bv] (= bv [x y])) broad)) (nil? (some (fn [bv] (= bv [x y])) not-include)))) (map #(map + current %) neighbours)))]
                     ;body
                     (loop [m mice to-remove '()]
                       (let [nn (mapcat #(get-neighbours % to-remove) m)]
                         (if (= 0 (count nn))
                           (if (nil? (some #{cheese} m))
                             false
                             true)
                           (recur nn (into to-remove m)))))
                     ))) true))))

(deftest q124-test
  (testing "q124 should pass"
    (is (= (q124 (fn [board that]
                   (let [ways (for [x [-1 0 1] y [-1 0 1] :when (not= 0 x y)] [x y])
                         next-seq #(rest (iterate (partial map + %2) %1))
                         [that? other?] (map #(fn [coor] (or (= %1 (get-in board coor)) nil))
                                             [that ({'w 'b 'b 'w} that)])
                         path #(let [[os [t]] (split-with other? %1)]
                                 (and (that? t) (seq os)))]
                     (into {} (for [x (range 4) y (range 4)
                                    :let [xy [x y]] :when (= 'e (get-in board xy))
                                    :let [s (set (mapcat #(path (next-seq xy %)) ways))] :when (seq s)]
                                [xy s]))))) true))))

(deftest q125-test
  (testing "q125 should pass"
    (is (= (q125) true))))
