(ns daily.day19-test
  (:require [clojure.test :refer :all]
            [daily.day19 :refer :all]))

(deftest q64-test
  (testing "q64 should pass"
    (is (= (q64 +) true))))

(deftest q54-test
  (testing "q54 should pass"
    (is (= (q54 (fn q54-ans
                  ([n coll]
                   (q54-ans n n coll))
                  ([n step coll]
                   (lazy-seq
                     (when-let [s (seq coll)]
                       (let [p (doall (take n s))]
                         (when (= n (count p))
                           (cons p (q54-ans n step (nthrest s step))))))))
                  ([n step pad coll]
                   (lazy-seq
                     (when-let [s (seq coll)]
                       (let [p (doall (take n s))]
                         (if (= n (count p))
                           (cons p (q54-ans n step pad (nthrest s step)))
                           (list (take n (concat p pad)))))))))))
           true)))

(deftest q55-test
  (testing "q55 should pass"
    (is (= (q55 (fn [coll]
                  (persistent!
                    (reduce (fn [counts x]
                              (assoc! counts x (inc (get counts x 0))))
                            (transient {}) coll)))) true))))
