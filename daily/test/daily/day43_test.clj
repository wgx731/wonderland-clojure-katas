(ns daily.day43-test
  (:require [clojure.test :refer :all]
            [daily.day43 :refer :all]))

(deftest q93-test
  (testing "q93 should pass"
    (is (= (q93 (fn f [xs]
                  (if (every? sequential? xs) (mapcat f xs) [xs]))) true))))

(deftest q94-test
  (testing "q94 should pass"
    (is (= (q94 (fn [data]
                  (letfn [(d-coll [coord]
                            (for [x (range -1 2) y (range -1 2)
                                  :when (not= 0 x y)
                                  :let [d (map + [x y] coord) ch (get-in data d)]]
                              (if (= ch \#) 1 0)))
                          (decide [r-i c-i ch]
                            (condp #(%1 %2) (->> [r-i c-i] d-coll (apply +))
                              #(and (= ch \#) (< % 2)) \space
                              #(and (= ch \#) (#{2 3} %)) \#
                              #(and (= ch \#) (> % 3)) \space
                              #(and (= ch \space) (= % 3)) \#
                              ch))]
                    (->> data
                         (map-indexed #(map-indexed (partial decide %1) %2))
                         (map #(apply str %)))))) true))))

(deftest q113-test
  (testing "q113 should pass"
    (is (= (q113 #(let [args %&]
                    (reify clojure.lang.Seqable
                      (toString [this] (clojure.string/join ", " (sort args)))
                      (seq [this] (seq (distinct args)))))) true))))

(deftest q114-test
  (testing "q114 should pass"
    (is (= (q114 (fn globalTakeWhile [n p coll]
                   (lazy-seq
                     (if (p (first coll)) ;if satisfy the predicate
                       (if (= 1 n) [] ;and the current item is the exclusive bound, then return
                                   (cons (first coll) (globalTakeWhile (dec n) p (rest coll))));else append current item and decrease n
                       (cons (first coll) (globalTakeWhile n p (rest coll))))));just append
                 ) true))))

(deftest q127-test
  (testing "q127 should pass"
    (is (= (q127 (let [int-to-bits (fn [i] (Integer/toString i 2))
                       zero-pad (fn [w i] (str (apply str (repeat (- w (count i)) 0)) i))
                       bit-extend-left (fn [n i] (+ 1 (bit-shift-left n i)))
                       next-row (fn [ns] (bit-extend-left (apply max ns) 1))
                       shift-all-left (fn [ns i] (map #(bit-shift-left % i) ns))
                       extend-all-left (fn [ns i] (map #(bit-extend-left % i) ns))
                       number-of-set-bits (fn [ns] (reduce + (map #(count (filter #{\1} (int-to-bits %))) ns)))

                       triangles {[1 3] #(concat % [(next-row %)])
                                  [3 1] #(concat [(next-row %)] %)
                                  [2 3] #(concat (shift-all-left % 1) [(next-row %)])
                                  [3 2] #(concat [(next-row %)] (shift-all-left % 1))
                                  [2 7] #(concat (shift-all-left % 2) [(next-row [(next-row %)])])
                                  [7 2] #(concat [(next-row [(next-row %)])] (shift-all-left % 2))
                                  [1 3 1] #(concat [1] (extend-all-left % 1) [1])
                                  [2 3 2] #(let [nr (+ 1 (apply max %))] (concat [nr] (extend-all-left % 1) [nr]))}

                       width (fn [ns] (count (int-to-bits (apply max ns))))
                       height (fn [ns] (count ns))

                       at-all-positions (fn [w h t]
                                          (for [x (range (- w (width t) -1))
                                                y (range (- h (height t) -1))]
                                            (concat (repeat y 0) (shift-all-left t x))))

                       matches? (fn [b t] (every? identity (map #(= %2 (bit-and %1 %2)) b t)))

                       any-pos-matches? (fn [b t] (some #(matches? b %) (at-all-positions (width b) (height b) t)))

                       all-size-matches (fn [b t grow-func]
                                          (let [bw (width b)
                                                bh (height b)]
                                            (filter identity
                                                    (map #(if (any-pos-matches? b %) % nil)
                                                         (take-while #(and (>= bw (width %)) (>= bh (height %))) (iterate grow-func t))))))

                       safe-apply-max (fn [ns] (if (< 0 (count ns)) (apply max ns)))
                       biggest-match (fn [b t grow-func] (safe-apply-max (map number-of-set-bits (all-size-matches b t grow-func))))
                       biggest-triangle (fn [b] (safe-apply-max (filter identity (map #(biggest-match b (key %) (val %)) triangles))))]
                   biggest-triangle)) true))))
