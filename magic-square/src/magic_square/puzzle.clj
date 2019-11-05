(ns magic-square.puzzle)

(def values [1.0 1.5 2.0 2.5 3.0 3.5 4.0 4.5 5.0])

;; [[1.5 4.0 3.5] [5.0 3.0 1.0] [2.5 2.0 4.5]]
(defn- magic? [board]
  (let [len (count board)
        main-diagonal (map #(get-in board %) (for [x (range len)] [x x]))
        anti-diagonal (map #(get-in board %) (for [x (range len)] [(- (dec len) x) x]))
        transposed-board (apply (partial map list) board)]
    (->> (concat board transposed-board [main-diagonal anti-diagonal])
         (map #(reduce + %))
         (apply =))))

(defn- permutations [s]
  (lazy-seq
    (if (seq (rest s))
      (apply concat (for [x s]
                      (map #(cons x %) (permutations (remove #{x} s)))))
      [s])))

(defn magic-square [values]
  (->> values
       permutations
       (map #(mapv vec (partition 3 %)))
       (filter magic?)
       first))