(ns daily.queen-of-hearts)

(def flowers ["white carnation"
              "yellow daffodil"
              "yellow rose"
              "red rose"
              "white rose"
              "purple lily"
              "pink carnation"])

(defn paint-it-yellow [s]
  (str "yellow "
       (last (clojure.string/split s #"\s"))))

(defn paint-it-red [s]
  (str "red "
       (last (clojure.string/split s #"\s"))))

(defn is-a-rose? [s]
  (= "rose"
     (last (clojure.string/split s #"\s"))))

(def fix-for-the-queen-xform
  (comp
    (map paint-it-red)
    (filter is-a-rose?)))
