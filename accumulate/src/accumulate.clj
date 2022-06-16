(ns accumulate)

(defn accumulate [accumulate_fn accumulate_collection]
  (let [length (count accumulate_collection)]
    (if
      (zero? length)
      []
      (let [[first & rest] accumulate_collection]
        (concat [(accumulate_fn first)] (accumulate accumulate_fn rest))))))
