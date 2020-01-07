(ns daily.day42-test
  (:require [clojure.test :refer :all]
            [daily.day42 :refer :all]))

(deftest q98-test
  (testing "q98 should pass"
    (is (= (q98 #(->> (group-by %1 %2)
                      (vals)
                      (map set)
                      (set))) true))))

(deftest q108-test
  (testing "q108 should pass"
    (is (= (q108 (fn [& xxs]
                   (let [[v-min v-max] (first (apply map (juxt min max) xxs))]
                     (if (= v-min v-max)
                       v-min
                       (recur (map (fn [xs]
                                     (drop-while #(< % v-max) xs)) xxs)))))) true))))

(deftest q110-test
  (testing "q110 should pass"
    (is (= (q110 (fn [col] (->> col
                                (iterate #(->> (partition-by identity %)
                                               (mapcat (fn [a] [(count a) (first a)]))))
                                (drop 1)))) true))))

(deftest q111-test
  (testing "q111 should pass"
    (is (= (q111 (fn [s b] (->> b
                                (map #(take-nth 2 (replace {\_ \.} %)))
                                (#(into % (apply map list %)))
                                (mapcat #(partition-by #{\#} %))
                                (map #(re-pattern (apply str %)))
                                (map #(re-matches % s))
                                (not-every? nil?)))) true))))

(deftest q112-test
  (testing "q112 should pass"
    (is (= (q112 (fn m [n [h & t :as col]]
                   (if (seq col)
                     (cond
                       (sequential? h) (concat [(m n h)] (m (- n (apply + (flatten h))) t))
                       (< n h) []
                       :else (concat [h] (m (- n h) t)))))) true))))
