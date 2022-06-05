(ns interest-is-interesting)

(defn interest-rate
  [balance]
  (if
    (>= balance 5000)
    2.475
    (if
      (>= balance 1000)
      1.621
      (if
        (>= balance 0)
        0.5
        -3.213))))

(defn annual-balance-update
  [balance]
  (* balance (bigdec (+ 1 (abs (/ (interest-rate balance) 100))))))

(defn amount-to-donate
  [balance tax-free-percentage]
  (if
    (>= balance 0)
    (int (* 2 (* balance (/ tax-free-percentage 100))))
    0))