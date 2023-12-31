(require '[babashka.process :as process]
         '[hiccup2.core :as h]
         '[components]
         '[body])

(defn build-tailwind []
  (process/sh "npx tailwindcss build -i tailwind.css -o dist/tailwind.css"))

(defn build-html []
  (let [hiccup [:html {:lang "en"} head/tag body/tag]
        html (str "<!DOCTYPE html> " (h/html hiccup))]
    (spit "dist/index.html" html)))

(defn build []
  (build-html)
  (build-tailwind))

(build)