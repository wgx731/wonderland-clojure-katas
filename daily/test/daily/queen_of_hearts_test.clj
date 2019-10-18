(ns daily.queen-of-hearts_test
  (:require [clojure.test :refer :all]
            [daily.queen-of-hearts :refer :all]))

(deftest paint-it-red-test
  (testing "it should paint the flower into red color"
    (is (= "red carnation" (paint-it-red "white carnation")) true)
    (is (=
          (list "red carnation" "red daffodil" "red rose" "red rose" "red rose" "red lily" "red carnation")
          (map paint-it-red flowers))
        true)
    ))

(deftest is-a-rose?-test
  (testing "only rose should pass the test"
    (is (is-a-rose? "yellow rose") true)
    (not= (is-a-rose? "white carnation") true)
    (is (=
          (list "yellow rose" "red rose" "white rose")
          (filter is-a-rose? flowers)) true)
    ))
(deftest fix-for-the-queen-xform-test
  (testing "only red rose should return"
    (let [ans ["red rose", "red rose", "red rose"]
          ans-str "red rose:red rose:red rose:"]
      (is (= ans (into [] fix-for-the-queen-xform flowers)) true)
      (is (= ans (take 3 (sequence fix-for-the-queen-xform flowers))) true)
      (is (= ans-str (transduce fix-for-the-queen-xform
                                (completing #(str %1 %2 ":"))
                                ""
                                flowers)
             ) true)
      )))
