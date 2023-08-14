(defproject shorter "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [compojure "1.1.6"]]
  :repl-options {:init-ns shorter.core}
  :plugins [[lein-ring "0.12.6"]]
  :ring {:handler shorter.handler/app
         :auto-reload? true})
