(ns wonderland-number.finder)

(defn same-digits? [a b]
  (= (sort (str a)) (sort (str b))))

(defn wonderland-numbers []
  (letfn [(f [x] (->> (map #(* x %) [2 3 4 5 6])
                 (every? #(same-digits? x %))))]
    (->> (range 100000 1000000)
         (filter f))))

(defn wonderland-number []
  (first (wonderland-numbers)))
