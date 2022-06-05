(ns bird-watcher)

(def last-week 
  '(0, 2, 5, 3, 7, 8, 4))

(defn today [birds]
  (last birds))

(defn inc-bird [birds]
  (update birds (- (count birds) 1) inc))

(defn day-without-birds? [birds]
  (or (some zero? birds) false))

(defn n-days-count [birds n]
  (reduce + (take n birds)))

(defn busy-days [birds]
  (count (filterv #(>= % 5) birds)))

(defn odd-week? [birds]
  (let [is-odd-sequence? (fn [partial-birds mod-result]
                           (if
                             (= (count partial-birds) 0)
                             true
                             (if
                               (= (mod (first partial-birds) 2) mod-result)
                               (recur (rest partial-birds) (mod (+ mod-result 1) 2))
                               false)))]
    (is-odd-sequence? birds 1)))
