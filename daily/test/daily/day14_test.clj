(ns daily.day14-test
  (:require [clojure.test :refer :all]
            [daily.day14 :refer :all]))

(deftest q95-test
  (testing "q95 should pass"
    (is (= (q95 (fn istree? [root]
                  (or (nil? root)
                      (and (sequential? root)
                           (= 3 (count root))
                           (every? istree? (rest root)))))) true))))

(deftest q96-test
  (testing "q96 should pass"
    (is (= (q96 (fn symmetry [[root left right]]
                  (let [mirror? (fn mirror? [a b]
                                  (cond
                                    (not= (sequential? a) (sequential? b)) false
                                    (sequential? a) (let [[ra La Ra] a
                                                          [rb Lb Rb] b]
                                                      (and (= ra rb) (mirror? La Rb) (mirror? Lb Ra)))
                                    :else (= a b)))]
                    (mirror? left right)))) true))))
