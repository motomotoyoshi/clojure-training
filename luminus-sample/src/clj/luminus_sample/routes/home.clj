(ns luminus-sample.routes.home
  (:require
   [luminus-sample.layout :as layout]
   [clojure.java.io :as io]
   [luminus-sample.middleware :as middleware]
   [ring.util.response]
   [ring.util.http-response :as response]))



(defn home-page [request]
  (layout/render request "home.html" {:docs (-> "docs/docs.md" io/resource slurp)}))

(defn about-page [request]
  (layout/render request "about.html"))

(defn home-routes []
  [ "" 
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats
                 ]}
   ["/" {:get home-page}]
   ["/about" {:get about-page}]])

