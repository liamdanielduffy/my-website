(require '[babashka.process :as process]
         '[hiccup2.core :as h]
         '[components :as c])

(defn build-tailwind []
  (process/sh "npx tailwindcss build -i tailwind.css -o dist/tailwind.css"))

(defn build-html []
  (spit "dist/index.html" (h/html c/html-tag)))

(defn build []
  (build-html)
  (build-tailwind))

(build)