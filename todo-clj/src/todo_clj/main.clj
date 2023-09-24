(ns todo-clj.main
  (:require [todo-clj.core :as core])
  (:gen-class)
  (:refer-clojure :exclude [boolean?]))

(defn -main [& {:as args}]
  (core/start-server))