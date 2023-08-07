(ns my-project.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(require '[my-project.hoge :as hoge])
(hoge/inc100 24)
