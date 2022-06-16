(ns acronym)

(defn acronym
  "Converts phrase to its acronym."
  [phrase]
  (let [words (clojure.string/split phrase #"(\s+|-|(?<=[a-z])(?=[A-Z]))")]
    (reduce
     str
     (map
      (fn [word] (if (empty? word) "" (clojure.string/upper-case(first word))))
      words))))
