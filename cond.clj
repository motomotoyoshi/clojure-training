(def x 3)

(if (> x 0)
  (println "over zero"))

(if (> x 0)
  (println "over zero")
  (println "under zero or equals zero"))

(if (> x 0)
  (do
    (println "over zero")
    (println "x > 0")))

(when (> x 0)
  (println "over zero")
  (println "x > 0"))
