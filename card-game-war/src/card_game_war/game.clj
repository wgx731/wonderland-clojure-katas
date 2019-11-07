(ns card-game-war.game)

(def suits [:spade :club :diamond :heart])
(def ranks [2 3 4 5 6 7 8 9 :jack :queen :king :ace])
(def cards
  (for [suit suits rank ranks] [suit rank]))

(def numeric-ranks {2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9 :jack 10 :queen 11 :king 12 :ace 13
                    :spade 1 :club 2 :diamond 3 :heart 4})

(defn numeric-rank
  [k]
  (get numeric-ranks k 0))

(defn play-round
  [player1-card player2-card]
  (let [[player1-suit-rank player1-rank] (map numeric-rank player1-card)
        [player2-suit-rank player2-rank] (map numeric-rank player2-card)]
    (cond
      (> player1-rank player2-rank) :player1
      (< player1-rank player2-rank) :player2
      (> player1-suit-rank player2-suit-rank) :player1
      :else :player2)))

(defn play-game
  [player1-cards player2-cards]
  (loop [player1-cards player1-cards
         player2-cards player2-cards]
    (cond
      (nil? (seq player2-cards)) :player1-wins
      (nil? (seq player1-cards)) :player2-wins
      :else
      (let [player1-card (first player1-cards)
            player2-card (first player2-cards)]
        (condp = (play-round player1-card player2-card)
          :player1 (recur (concat (rest player1-cards) [player1-card player2-card])
                          (rest player2-cards))
          :player2 (recur (rest player1-cards)
                          (concat (rest player2-cards) [player2-card player1-card])))))))