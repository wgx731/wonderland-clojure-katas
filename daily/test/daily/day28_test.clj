(ns daily.day28-test
  (:require [clojure.test :refer :all]
            [daily.day28 :refer :all]))

(deftest q126-test
  (testing "q126 should pass"
    (is (= (q126 Class) Class))))

(deftest q135-test
  (testing "q135 should pass"
    (is (= (q135 (fn f [a o b & c]
                     (if c
                       (apply f (o a b) c)
                       (o a b)))) true))))

(deftest q137-test
  (testing "q137 should pass"
    (is (= (q137 (fn base [x b]
                   (if (< x b) [x]
                               (conj (base (quot x b) b) (mod x b))))) true))))

(deftest q138-test
  (testing "q138 should pass"
    (is (= (q138 (fn [start end]
                   (let [n-seq (->> (iterate #(* % %) start)
                                    (take-while #(<= % end))
                                    (mapcat str))
                         nc (count n-seq)
                         size (some #(and (<= nc (* % %)) %) (range))
                         q-seq (take (* size size) (concat n-seq (repeat \*)))
                         r-start (let [z (dec size) sh (- z (mod z 2))]
                                   [sh z])
                         v+ (partial map +)
                         ways (cycle [[1 1] [1 -1] [-1 -1] [-1 1]])
                         steps (->> (interleave (range) (range)) (drop 2))
                         roll (->> (mapcat repeat steps ways) (reductions v+ r-start))
                         coords (zipmap roll q-seq)
                         out-size (dec (* 2 size))]
                     (for [x (range out-size)]
                       (apply str (for [y (range out-size)]
                                    (get coords [x y] \space))))))) true))))
