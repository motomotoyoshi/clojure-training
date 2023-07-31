(ns abc.core
  (:require [clojure.edn :as edn]
            [clojure.string :as cstring]))
;(use 'clojure.string)
;(require '[clojure.edn :as edn])

(def cons-point (fn[x y]
                  {:x x :y y}))
(cons-point 3 4)

(comment "ここはコメント")
#_(do
  (def x 10)
  (def y 20)
  (def z 30))
#_ (list 1 2 3)
