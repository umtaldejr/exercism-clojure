(ns elyses-destructured-enchantments)

(defn first-card
  "Returns the first card from deck."
  [deck]
  (let [[first-card remaning-cards] deck]
    first-card))

(defn second-card
  "Returns the second card from deck."
  [deck]
  (let [[first-card second-card remaning-cards] deck]
    second-card))

(defn swap-top-two-cards
  "Returns the deck with first two items reversed."
  [deck]
  (let [[first-card second-card & remaning-cards] deck]
    (if (nil? remaning-cards) [second-card first-card] (concat [second-card first-card] remaning-cards))))

(defn discard-top-card
  "Returns a vector containing the first card and
   a vector of the remaining cards in the deck."
  [deck]
  (let [[first-card & remaning-cards] deck]
    [first-card remaning-cards]))

(def face-cards
  ["jack" "queen" "king"])

(defn insert-face-cards
  "Returns the deck with face cards between its head and tail."
  [deck]
  (let [[first-card & remaning-cards] deck]
    (if (= first-card nil) face-cards (concat [first-card] face-cards remaning-cards))))
