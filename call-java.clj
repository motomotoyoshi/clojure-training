(import 'java.awt.Toolkit)
(import 'java.awt.datatransfer.StringSelection)
(import 'java.awt.datatransfer.Clipboard)

(defn copy [text]
  (let [clipboard (.getSystemClipboard (Toolkit/getDefaultToolkit))]
    (.setContents clipboard (StringSelection. text) nil)))
(copy "Hello Clojure!")
