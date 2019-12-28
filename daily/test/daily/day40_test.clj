(ns daily.day40-test
  (:require [clojure.test :refer :all]
            [daily.day40 :refer :all]))

(deftest q75-test
  (testing "q75 should pass"
    (is (= (q75 (fn [n]
                  (letfn [(gcd [x y] (if (zero? y) x (recur y (mod x y))))]
                    (if (= 1 n)
                      1
                      (->> (range 1 n)
                           (filter #(= 1 (gcd n %)))
                           count))))) true))))

(deftest q85-test
  (testing "q85 should pass"
    (is (= (q85 (fn [ss] (->> (map (fn [v] #(->> v (conj %2) (conj %1))) ss)
                              (reduce #(reduce %2 %1 %1) #{#{}})))) true))))

(deftest q86-test
  (testing "q86 should pass"
    (is (= (q86 (fn happy?
                  ([n] (happy? [] n))
                  ([seen n]
                   (cond
                     (= 1 n)
                     true
                     (contains? seen n)
                     false
                     true
                     (recur (conj seen n)
                            (->> n
                                 (str)
                                 (map #(- (int %) (int \0)))
                                 (map #(* % %))
                                 (reduce +) )))))) true))))

(deftest q89-test
  (testing "q89 should pass"
    (is (= (q89 (fn [edges]
                  (let [maps (map #(list (hash-map (first %) (rest %)) (hash-map (last %) (butlast %))) edges)
                        all (apply merge-with concat (flatten maps))]
                    (or (= 1 (count edges)) (every? even? (map #(count (distinct (val %))) all)))))) true))))

(deftest q91-test
  (testing "q91 should pass"
    (is (= (q91 (fn f [edges]
                  (let [maps (map #(list (hash-map (first %) (rest %)) (hash-map (last %) (butlast %))) edges)
                        all (apply merge-with concat (flatten maps))
                        reachable (fn [self seen start]
                                    (flatten
                                      (cons start
                                            (for [node (all start) :when (not (seen node))]
                                              (self self (assoc seen node 1) node)))))]
                    (or (= 1 (count edges))
                        (= (set (keys all)) (set (reachable reachable {} (key (first all))))))))) true))))
