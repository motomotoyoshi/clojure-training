((fn [a b c] (* a b c)) 2 3 4)

(filter (fn [num] (even? num)) [1 2 3 4])
(filter (fn [num] (> num 2)) [ 1 2 3 4])
(filter #(even? %) [1 2 3 4])

;(def inc3 (fn  [x] (+ x 3)))
(defn inc3 [x] (+ x 3))
(inc3 3)

(fn [a b c] (* a b c))
(#(* %1 %2 %3) 2 3 4)

