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

(if-not (> x 0)
  (println "x <= 0"))

(cond
  (> x 0) (println "over zero")
  (= x 0) (println "equals zero")
  :else (println "under zero"))

(defn multiple-of-3? [num]
  (cond
    (= (mod num 3) 0) true
    :else false))
(println (multiple-of-3? x))

(defn aaa [num]
  (condp = num
    1 (println "1")
    2 (println "2")
    3 (println "3")
    (println "other")))
(aaa 9)

(condp #(> %2 %1) x
  10 (println "> 10")
   5 (println "> 5")
   0 (println "> 0")
   (println "<= 0"))
