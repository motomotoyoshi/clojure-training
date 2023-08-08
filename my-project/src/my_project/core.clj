(ns my-project.core)

(defn parse-int [str]
  (Integer. str))

(defn -main [& args]
  (println "Sum: " (reduce + (map parse-int args))))
