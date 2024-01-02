(require '[babashka.process :as process]
         '[hiccup2.core :as h]
         '[components :as c])

(defn prepare-to-build []
  (process/sh "mkdir build build/draft build/final")
  (process/sh "touch build/draft/index.html"))

(defn build-tailwind []
  (process/sh "npx tailwindcss build -i tailwind.css -o build/draft/tailwind.css"))

(defn build-html []
  (spit "build/draft/index.html" (h/html c/html-tag)))

(defn draft-build []
  (build-html)
  (build-tailwind))

(defn commit-build []
   ;; for some reason, cp -rf build/draft build/final/* doesn't work, not sure why so hacking around it for now
  (process/sh "cp build/draft/index.html build/final/index.html")
  (process/sh "cp build/draft/tailwind.css build/final/tailwind.css"))

(defn build []
  (prepare-to-build)
  (draft-build)
  (commit-build))

(build)