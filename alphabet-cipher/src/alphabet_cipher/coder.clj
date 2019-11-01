(ns alphabet-cipher.coder)

(def alphabets [\a \b \c \d \e \f \g \h \i \j \k \l \m \n \o \p \q \r \s \t \u \v \w \x \y \z])

(defn get-alphabet-index [item]
  (.indexOf alphabets item))

(defn encode-alphabet [col row]
  (->> alphabets
       (cycle)
       (drop col)
       (take (inc row))
       (last)))

(defn move-alphabet [n]
  (->> alphabets
       (cycle)
       (drop n)
       (take 26)))

(defn decode-alphabet [col res]
  (get alphabets (.indexOf (move-alphabet col) res)))

(defn extract-key-alphabet [res row]
  (get alphabets (.indexOf (move-alphabet row) res)))

(defn first-seq [coll n]
  (if (apply = (partition n coll))
    (first (partition n coll))
    (recur coll (inc n))))

(defn encode [keyword message]
  (let [k (map get-alphabet-index (take (count message) (cycle keyword)))
        m (map get-alphabet-index message)]
    (apply str (map encode-alphabet k m))))

(defn decode [keyword message]
  (let [k (map get-alphabet-index (take (count message) (cycle keyword)))
        m message]
    (apply str (map decode-alphabet k m))))

(defn decipher [cipher message]
  (let [c cipher
        m (map get-alphabet-index message)]
    (apply str (first-seq (map extract-key-alphabet c m) 1))))
