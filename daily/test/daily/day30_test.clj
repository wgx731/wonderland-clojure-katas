(ns daily.day30-test
  (:require [clojure.set]
            [clojure.test :refer :all]
            [daily.day30 :refer :all]))

(deftest q157-test
  (testing "q157 should pass"
    (is (= (q157 #(map
                    (fn [a b] [a b])
                    % (range (count %)))) true))))

(deftest q158-test
  (testing "q158 should pass"
    (is (= (q158 (fn [f]
                   (fn [& args]
                     (reduce #(%1 %2) f args)))) true))))

(deftest q164-test
  (testing "q164 should pass"
    (is (= (q164 (fn [{:keys [start transitions accepts]}]
                   (letfn [(test [res [res-s state]]
                             (and (accepts state) (not (res res-s))))
                           (t-merge [res agg]
                             (->> (filter (partial test res) agg)
                                  (map (comp str first))
                                  (into res)))
                           (spread [trans [agg res] [res-s state]]
                             (let [part (for [[ch n-state] (state trans)]
                                          [(str res-s ch) n-state])]
                               [(into agg part)
                                (t-merge res part)]))
                           (step [[agg res] res-agg]
                             (let [trans (select-keys transitions (vals agg))
                                   next (reduce (partial spread trans) [{} res] agg)]
                               (if (empty? trans)
                                 res
                                 (lazy-cat (clojure.set/difference res res-agg)
                                           (step next res)))))]
                     (let [agg (start transitions)
                           res (t-merge #{} agg)]
                       (step [agg res] #{}))))) true))))
