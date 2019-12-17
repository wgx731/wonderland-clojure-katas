(ns daily.day33-test
  (:require [clojure.set]
            [clojure.test :refer :all]
            [daily.day33 :refer :all]))

(deftest q128-test
  (testing "q128 should pass"
    (is (= (q128 (fn [[s r]]
                   {:suit (condp = s
                            \D :diamond
                            \H :heart
                            \C :club
                            \S :spade)
                    :rank (condp = r
                            \A 12
                            \K 11
                            \Q 10
                            \J 9
                            \T 8
                            (- (int r) 50))})) true))))

(deftest q130-test
  (testing "q130 should pass"
    (is (= (q130 (fn reparent
                   ([root tree]
                    (if (= (first tree) root) tree (reparent root tree '())))
                   ([root tree past]
                    (if (= (first tree) root)
                      (concat tree [past])
                      (some identity
                            (for [i (range 1 (count tree))]
                              (reparent root
                                        (nth tree i)
                                        (if (empty? past)
                                          (concat (take i tree) (drop (inc i) tree))
                                          (concat (take i tree) (drop (inc i) tree) [past])
                                          )
                                        )
                              )
                            )
                      )
                    )
                   )) true))))

(deftest q131-test
  (testing "q131 should pass"
    (is (= (q131 (fn [& sets]
                   (let [p-set (fn [ss] (->> (map (fn [v] #(->> v (conj %2) (conj %1))) ss)
                                             (reduce #(reduce %2 %1 %1) #{#{}})))]
                     (->> (map p-set sets)
                          (map #(disj % #{}))
                          (map #(map (partial apply +) %))
                          (map set)
                          (apply clojure.set/intersection)
                          (empty?) (not))))) true))))
