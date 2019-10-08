(ns daily.core-test
  (:require [clojure.test :refer :all]
            [daily.core :refer :all]))

(deftest hello-test
  (testing "Should see hello from wgx731"
    (is (= (hello "wgx731") "Hello from wgx731!"))))
