(require '[babashka.process :as process]
         '[utils])

(defn build-tailwind []
  (process/sh "npx tailwindcss build -i tailwind.css -o dist/tailwind.css"))

(defn build-html []
  (spit "dist/index.html" (utils/build-html)))

(defn build []
  (build-html)
  (build-tailwind))

(build)