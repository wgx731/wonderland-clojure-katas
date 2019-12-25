(ns daily.day37-test
  (:require [clojure.test :refer :all]
            [daily.day37 :refer :all]))

(deftest q59-test
  (testing "q59 should pass"
    (is (= (q59 (fn [& fs]
                  (fn [& p]
                    (map #(apply % p) fs)))) true))))

(deftest q60-test
  (testing "q60 should pass"
    (is (= (q60 (fn r
                  ([f xs] (r f (first xs) (rest xs)))
                  ([f v xs]
                   (lazy-seq
                     (cons v
                           (if (empty? xs)
                             []
                             (r f (f v (first xs)) (rest xs)))))))) true))))

(deftest q70-test
  (testing "q70 should pass"
    (is (= (q70 #(->> (re-seq #"\w+" %)
                      (sort-by clojure.string/lower-case))) true))))

(deftest q73-test
  (testing "q73 should pass"
    (is (= (q73 (fn [board]
                  (letfn [(check [[[a b c][d e f][g h i]] p]
                            (or (= p a b c)
                                (= p d e f)
                                (= p g h i)
                                (= p a d g)
                                (= p b e h)
                                (= p c f i)
                                (= p a e i)
                                (= p c e g)))]
                    (cond (check board :x) :x
                          (check board :o) :o
                          :else nil)))) true))))

(deftest q74-test
  (testing "q74 should pass"
    (is (= (q74 #(->> (re-seq #"\d+" %)
                      (map read-string)
                      (filter (fn [x] (== (Math/sqrt x) (int (Math/sqrt x)))))
                      (clojure.string/join ","))) true))))
