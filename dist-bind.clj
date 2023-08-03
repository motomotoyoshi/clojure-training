(let [x [1 2 3 4 5]
      v1 (first x)
      v2 (first (rest x))
      v3 (first (rest (rest x)))]
  [v3 v2 v1])

(let [x [1 2 3 4 5]
      [v1 v2 v3] x]
  [v3 v2 v1])

(let [m {:name "Peter" :age 30}
      {name :name age :age} m]
      [name age])
