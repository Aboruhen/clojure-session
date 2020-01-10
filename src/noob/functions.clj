(ns noob.functions
  (:gen-class))

(defn -main
  "First function"
  []
  (println "My Name is Roman")
  (println "loving Clojure so far")
  (+ 2 5))

#(println "Test")

(def increment (fn [x] (+ x 1)))

(defn increment_set
  []
  (map increment [1 2 3]))

(defn increment_set2
  [x]
  (map increment x))

(defn DataTypes []
  (def a 1)
  (def b 1.25)
  (def c 1.25e-12)
  (def d 0xfbfc)
  (def e nil)
  (def f true)
  (def g "Fello")
  (def h 'thanks)

  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println g)
  (println h)
  )

(DataTypes)