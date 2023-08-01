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

