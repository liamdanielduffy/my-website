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
  ;; passing "cp -rf ..." to "bash -c" for proper glob expansion of build/draft/*
  ;; running "cp -rf ..." directly gives directory not found error
  (process/sh "bash -c" "cp -rf build/draft/* build/final"))

(defn build []
  (prepare-to-build)
  (draft-build)
  (commit-build))

(build)