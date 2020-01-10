(ns noob.Conditionals)

(defn CondIf
  []
  (println "\nCondIf:")
  (if (= 5 6)
    (println "Equal")
    (println "Not equal")
    ))

(CondIf)

(defn ConfIfDo
  []
  (println "\nCondIfDo:")
  (if (= 5 6)
    (do (println "Equal first statement")
        (println "Equal second statement"))
    (do (println "Not equal first statement")
        (println "Not equal second statement"))
    ))
(ConfIfDo)

(defn CondNestedIf
  []
  (println "\nNestedIf:")
  (if (and (= 5 5 ) (= 2 3))
    (println "true")
    (println "false"))
  )
(CondNestedIf)

(defn CondCase
  [pet]
  (println "\nCondCase:")
  (case pet
    "cat" (println "I have a cat")
    "dog" (println "I have a dog")
    "fish" (println "I have a fish")
    ))
(CondCase "cat")

(defn CondCond
  [amount]
  (println "\nCondCond:")
  (cond
    (<= amount 2) (println "few")
    (<= amount 10) (println "several")
    (<= amount 100) (println "many")
    :else (println "Loads")
    ))
(CondCond 101)