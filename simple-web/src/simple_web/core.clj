(ns simple-web.core
  (:use org.httpkit.server))
(use 'clojure.pprint)

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "hello HTTP kit"})

(defn -main []
  (run-server app {:port 8080}))

;; (-main)
