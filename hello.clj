(defn hoge []
  (println "hoge"))
(hoge)

(defn switch-args
  ([] (println "no arg"))
  ([x] (println "x: " x))
  ([x y] (println "x: " x "y: " y)))
(switch-args)
(switch-args 3)
(switch-args 3 4)
