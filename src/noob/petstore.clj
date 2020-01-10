(ns noob.petstore)

(defn petToHumanAge
  "This function return the age of pet in human years"
  [x]
  (def petStore {'dog 7, 'cat 5, 'goldFish 10})
  (get petStore x))

(defn age
  "This function return the age of a pet"
  [petName petType petAge]
  (def ration (petToHumanAge petType))
  (println petName "is" (* petAge ration) "years old in human years"))

(age "Fido" 'dog 4)
(age "Fido" 'cat 2)
(age "Bubbles" 'goldFish 10)