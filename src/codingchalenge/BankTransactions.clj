(ns codingchalenge.BankTransactions)

(def buyerAccount (ref 100))
(def merchantAccount (ref 0))
(def prices {'pen 1, 'notebook 5, ' backpack 10})
(def items (ref []))

(defn printInfo
  []
  (println "\nPrintInfo:")
  (println "buyerAccount:" @buyerAccount)
  (println "merchantAccount:" @merchantAccount)
  (println "items:" @items)
  )

(defn buy
  [item amount]
  (def itemPrice (get prices item))
  (if (<= (* itemPrice amount) @buyerAccount)
    (dosync
      (ref-set merchantAccount (+ @merchantAccount itemPrice))
      (ref-set buyerAccount (- @buyerAccount itemPrice))
      (def newItems (concat (repeat amount item) @items))
      (ref-set items newItems)
      )
    (println "Insufficient funds")
    )
  (printInfo)
  )
(buy 'backpack 11)
