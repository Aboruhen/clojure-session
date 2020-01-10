(ns noob.Sequences)

(defn Seq
  []
  (def colors (seq ["red" "green" "blue"]))
  (println colors)

  (println (cons "yellow" colors))
  (println (cons colors "yellow"))

  (println (conj colors "yellow"))
  (println (conj ["r" "g" "b"] "yellow"))

  (println (concat colors (seq ["black" "white"])))

  (println (distinct (seq [1 2 3 5  3 4 5])))

  (println (reverse (seq [1 2 3 5  3 4 5])))

  (println (reverse colors))

  (println (first colors))
  (println (rest colors))
  (println (last colors))

  (println (sort colors))

  )
(Seq)