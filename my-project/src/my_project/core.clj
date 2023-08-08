(ns my-project.core
  (:gen-class))

(defn parse-int [str]
  (Integer. str))

(defn -main [& args]
  (println "Sum: " (reduce + (map parse-int args))))
