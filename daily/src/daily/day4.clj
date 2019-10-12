(ns daily.day4
  (:require [clojure.set]))

(defn q13
  "http://www.4clojure.com/problem/13"
  [ans]
  (= ans (rest [10 20 30 40])))

(defn q14
  "http://www.4clojure.com/problem/14"
  [ans]
  (= ans ((fn add-five [x] (+ x 5)) 3) ((fn [x] (+ x 5)) 3) (#(+ % 5) 3) ((partial + 5) 3)))

(defn q15
  "http://www.4clojure.com/problem/15"
  [ans]
  (and (= (ans 2) 4) (= (ans 3) 6) (= (ans 11) 22) (= (ans 7) 14)))

(defn q16
  "http://www.4clojure.com/problem/16"
  [ans]
  (and (= (ans "Dave") "Hello, Dave!") (= (ans "Jehn") "Hello, Jehn!") (= (ans "Rhea") "Hello, Rhea!")))

(defn q17
  "http://www.4clojure.com/problem/17"
  [ans]
  (= ans (map #(+ % 5) '(1 2 3))))

(defn q18
  "http://www.4clojure.com/problem/18"
  [ans]
  (= ans (filter #(> % 5) '(3 4 5 6 7))))

(defn q19
  "http://www.4clojure.com/problem/19"
  [ans]
  (and (= (ans [1 2 3 4 5]) 5) (= (ans '(5 4 3)) 3) (= (ans ["b" "c" "d"]) "d")))

(defn q20
  "http://www.4clojure.com/problem/20"
  [ans]
  (and (= (ans (list 1 2 3 4 5)) 4) (= (ans ["a" "b" "c"]) "b") (= (ans [[1 2] [3 4]]) [1 2])))
