(for [x [1 2 3]]
  (println (* x 4)))

(for [a (range 1 10)
      b (range 1 10)]
  (* a b))

(take 10 (for [x (range)
               :when (even? x)] x))

(doall (for [x (range 10)] (println x)))
