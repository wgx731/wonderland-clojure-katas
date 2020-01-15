(ns daily.day45-test
  (:require [clojure.test :refer :all]
            [daily.day45 :refer :all]))

(deftest q171-test
  (testing "q171 should pass"
    (is (= (q171 (fn [x]
                   (->> (partition-all 2 1 (sort x))
                        (#(cons [(ffirst %)] %))
                        (remove (fn [[a b]] (and b (< (- b a) 2))))
                        flatten
                        (partition 2)))) true))))

(deftest q177-test
  (testing "q177 should pass"
    (is (= (q177 (fn [s]
                   (let [p  {\( \) \[ \] \{ \}}
                         b #{\( \) \[ \] \{ \}}]
                     (empty?
                       (reduce (fn [[h & t :as xs] x]
                                 (cond
                                   (= (p h) x) t
                                   (b x) (conj xs x)
                                   :else xs))
                               () s))))) true))))

(deftest q178-test
  (testing "q178 should pass"
    (is (= (q178 (fn [x]
                   (let [f (fn [r]
                             (case r
                               \A 12
                               \K 11
                               \Q 10
                               \J 9
                               \T 8
                               (- (Character/digit r 10) 2)))
                         cards (map seq x)
                         suits (map first x)
                         ranks (sort (map (comp f second) x))
                         s (count (distinct suits))
                         r (count (distinct ranks))
                         n (range (first ranks) (+ 5 (first ranks)))
                         pair (apply max (vals (frequencies ranks)))
                         flush? (= s 1)
                         straight? (and (= pair 1) (or (= ranks n) (= ranks [0 1 2 3 12])))]
                     (cond
                       (and flush? straight?) :straight-flush
                       (= pair 4) :four-of-a-kind
                       (and (= pair 3) (= r 2)) :full-house
                       flush? :flush
                       straight? :straight
                       (= pair 3) :three-of-a-kind
                       (= r 3) :two-pair
                       (= r 4) :pair
                       :else :high-card)))) true))))

(deftest q168-test
  (testing "q168 should pass"
    (is (= (q168 (fn ls
                   ([f] (ls f 0 0))
                   ([f x y]
                    (lazy-seq (cons ((fn ls-in [y]
                                       (lazy-seq (cons (f x y) (ls-in (inc y))))) y) (ls f (inc x) y))))
                   ([f x y n m]
                    (->> (ls f x y) (map #(take m %)) (take n))))) true))))

(deftest q92-test
  (testing "q92 should pass"
    (is (= (q92 (fn [x]
                  (let [num {\M 1000 \D 500 \C 100 \L 50 \X 10 \V 5 \I 1}
                        f (fn [[a b]] (if (and b (< a b)) (- a) a))]
                    (->> (map num x)
                         (partition-all 2 1)
                         (map f)
                         (apply +))))) true))))

(deftest q152-test
  (testing "q152 should pass"
    (is (= (q152 (fn squares [vecs]
                   (let [max-count (apply max (map count vecs))
                         positions #(range (inc (- max-count (count %))))
                         alignments (fn [v] (map #(concat
                                                    (repeat % nil)
                                                    v
                                                    (repeat (- max-count (count v) %) nil))
                                                 (positions v)))
                         cartesian-product (fn f [colls]
                                             (if (empty? colls)
                                               '(())
                                               (for [x (first colls)
                                                     more (f (rest colls))]
                                                 (cons x more))))
                         all-planes (cartesian-product (map alignments vecs))
                         transpose #(apply map vector %)
                         get-slices-of (fn [n plane]
                                         (map #(take n (drop % plane))
                                              (range (inc (- (count plane) n)))))
                         get-squares-of (fn [n plane]
                                          (map transpose (mapcat (comp (partial get-slices-of n) transpose)
                                                                 (get-slices-of n plane)))
                                          )
                         candidate-sizes (range 2 (inc (min (count vecs) max-count)))
                         all-candidates (mapcat (fn [n] (mapcat (partial get-squares-of n) all-planes))
                                                candidate-sizes)
                         is-latin? (fn [square]
                                     (and (every? (partial apply distinct?) square)
                                          (every? (partial apply distinct?) (transpose square))
                                          (= (count square) (count (set (flatten square))))
                                          (not (contains? (set (flatten square)) nil))))

                         ]
                     (frequencies (map count (distinct (filter is-latin? all-candidates))))))) true))))
