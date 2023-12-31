(require '[babashka.process :as process]
         '[utils])

(defn update-tailwind []
  (process/sh "npx tailwindcss build -i tailwind.css -o dist/tailwind.css"))

(defn update-html []
  (spit "dist/index.html" (utils/build-html)))

(defn build []
  (update-html)
  (update-tailwind))

(build)