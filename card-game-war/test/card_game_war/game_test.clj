(ns card-game-war.game-test
  (:require [clojure.test :refer :all]
            [card-game-war.game :refer :all]))

(deftest test-play-round
  (testing "the highest rank wins the cards in the round"
    (is (= :player1 (play-round [:heart 4] [:heart 3])))
    (is (= :player1 (play-round [:club 4] [:heart 3])))
    (is (= :player1 (play-round [:spade 4] [:spade 3])))
    (is (= :player1 (play-round [:diamond 4] [:diamond 3]))))
  (testing "queens are higer rank than jacks"
    (is (= :player1 (play-round [:heart :queen] [:heart :jack]))))
  (testing "kings are higer rank than queens"
    (is (= :player1 (play-round [:heart :king] [:heart :queen]))))
  (testing "aces are higer rank than kings"
    (is (= :player1 (play-round [:heart :ace] [:heart :king]))))
  (testing "if the ranks are equal, clubs beat spades"
    (is (= :player1 (play-round [:club :ace] [:spade :ace]))))
  (testing "if the ranks are equal, diamonds beat clubs"
    (is (= :player1 (play-round [:diamond :ace] [:club :ace]))))
  (testing "if the ranks are equal, hearts beat diamonds"
    (is (= :player1 (play-round [:heart :ace] [:diamond :ace])))))

(deftest test-play-game
  (testing "the player loses when they run out of cards"
    (is (= :player2-wins (play-game [[:spade 4] [:heart :jack]]
                                    [[:heart 4] [:spade :ace]])))
    (is (= :player1-wins (play-game [[:club :ace]
                                     [:club :jack]
                                     [:spade 8]
                                     [:diamond 3]
                                     [:diamond :queen]
                                     [:spade :ace]
                                     [:club 2]
                                     [:club 7]
                                     [:heart 7]
                                     [:spade 4]
                                     [:heart 3]
                                     [:heart 9]
                                     [:heart :queen]
                                     [:spade 7]
                                     [:diamond :jack]
                                     [:heart :ace]
                                     [:diamond 8]
                                     [:club 4]
                                     [:club 9]
                                     [:diamond 9]
                                     [:club 3]
                                     [:heart 8]
                                     [:heart :king]
                                     [:spade 2]]
                                    [[:club :king]
                                     [:spade :king]
                                     [:diamond 5]
                                     [:spade 9]
                                     [:spade 6]
                                     [:club 5]
                                     [:club :queen]
                                     [:heart 6]
                                     [:diamond 6]
                                     [:heart :jack]
                                     [:spade 3]
                                     [:diamond :king]
                                     [:heart 4]
                                     [:heart 5]
                                     [:diamond 2]
                                     [:spade :queen]
                                     [:spade :jack]
                                     [:club 6]
                                     [:diamond 4]
                                     [:diamond 7]
                                     [:heart 2]
                                     [:diamond :ace]
                                     [:club 8]
                                     [:spade 5]])))))