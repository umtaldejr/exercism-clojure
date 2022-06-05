(ns cars-assemble)

(def success-rates {
                    0 0.0
                    1 1.0
                    2 1.0
                    3 1.0
                    4 1.0
                    5 0.9
                    6 0.9
                    7 0.9
                    8 0.9
                    9 0.8
                    10 0.77})

(def base-production 221)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (* (get success-rates speed) (* speed base-production)))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (/ (production-rate speed) 60)))
