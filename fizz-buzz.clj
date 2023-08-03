(defn in-fizz-buzz [i]
  (condp #(= (mod %2 %1) 0) i
    15 "Fizz Buzz"
    3 "Fizz"
    5 "Buzz"
    i))
(in-fizz-buzz 15)

(defn fizz-buzz []
  (map #(in-fizz-buzz (inc %1))(range)))
(take 30 (fizz-buzz))
