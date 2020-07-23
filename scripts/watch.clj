(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'hello-clojure.core
   :output-to "out/hello_clojure.js"
   :output-dir "out"})
