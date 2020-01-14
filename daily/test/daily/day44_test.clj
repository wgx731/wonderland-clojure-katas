(ns daily.day44-test
  (:require [clojure.test :refer :all]
            [daily.day44 :refer :all]))

(deftest q132-test
  (testing "q132 should pass"
    (is (= (q132 #(->> (partition-all 2 1 %3)
                       (mapcat (fn [[a b]] (if (and b (% a b)) [a %2] [a]))))) true))))

(deftest q140-test
  (testing "q140 should pass"
    (is (= (q140 (fn
                   veitch-karnaugh
                   [board]
                   (let [opposed-vals '{a A b B c C d D A a B b C c D d}
                         minimize-fn (fn [rules]
                                       (apply hash-set (distinct (mapcat (fn [rule] (let [res (filter identity (map (fn [v] (if (contains? rules (conj (disj rule v) (v opposed-vals))) (disj rule v))) rule))] (if (< 0 (count res)) res [rule]))) rules))))
                         full-minimize (fn full-minimize [rules]
                                         (let [result (minimize-fn rules)]
                                           (if (= rules result) rules (full-minimize result))))
                         filter-comparable (fn [rule rules]
                                             (not-every? (fn [v] (some #(contains? % v) rules)) rule))]
                     (let [result (full-minimize board)]
                       (if (= result board)
                         board
                         (apply hash-set (filter #(filter-comparable % (disj result %)) result))))))) true))))

(deftest q141-test
  (testing "q141 should pass"
    (is (= (q141 (fn [trump]
                   (fn [[{:keys [suit]} :as cards]]
                     (-> #(condp = (:suit %)
                            trump (- -100 (:rank %))
                            suit (- (:rank %))
                            0)
                         (sort-by cards)
                         first)))) true))))

(deftest q148-test
  (testing "q148 should pass"
    (is (= (q148 (fn [n a b]
                   (letfn [(f [n] (/ (*' n (inc n)) 2))
                           (g [x] (f (quot (dec n) x)))]
                     (-> (*' a (g a))
                         (+ (*' b (g b)))
                         (- (*' a b (g (* a b)))))))) true))))

(deftest q150-test
  (testing "q150 should pass"
    (is (= (q150 (fn palindrom [x]
                   (let [to-num #(->> % (apply str) read-string)
                         xs (str x)
                         [q m] ((juxt quot mod) (count xs) 2)
                         [left [pivot]] (split-at q xs)
                         left-num (to-num (concat left (if (= 1 m) [pivot])))
                         try-num (->> left reverse (cons left-num) to-num)]
                     (if (< try-num x)
                       (recur (to-num (cons (inc left-num) (repeat q 0))))
                       (->> try-num inc palindrom lazy-seq (cons try-num)))))) true))))
