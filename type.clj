(inc 3)
(min 3 4 5)
(max 3 4 5)

(str "a" "b")
(str 1 2 3)
(str)

(require '[clojure.string :as cstring])
(cstring/blank? "asdf")
(cstring/blank? "")
(cstring/upper-case "hello clojure")
(cstring/lower-case "HELLO CLOJURE")
(count "1234")

'(1234)
(def ls (list 1 2 3 4))
(first ls)
(rest ls)
(last ls)
(take 2 ls)
(take 1 ls)

[1 2 3]
[:a 333]
(def vect [11 22 33])
(get vect 1)
(vect 0)

(def person {:name "Taro", :age 25})
(get person :age)
(keys person)
(vals person)
(hash-map :a 5 :b 7)

(set [1 2 3 1 2 3])

(count #{0 1 2})
(get #{:a :b :c} :d)

(range 10)
(range 2 10)
(range 2 10 3)

(repeat 2 :b)

