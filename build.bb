(require '[babashka.process :as process]
         '[hiccup2.core :as h]
         '[components :as c]
         '[babashka.cli :as cli])

(defn is-dev []
  (let [flags (:opts (cli/parse-args *command-line-args*))
        is-dev (:dev flags)]
    is-dev))

(defn setup-directories []
  (process/sh "mkdir build build/dev")
  (when (not (is-dev)) (process/sh "mkdir build/prod")))

(defn build-tailwind []
  (prn (process/sh "npx tailwindcss build -i tailwind.css -o build/dev/tailwind.css --minify")))

(defn build-cljs []
  (prn (process/sh "npx squint compile src/script.cljs")))

(defn build-html []
  (spit "build/dev/index.html" (str "<!doctype html>" (h/html (c/html-tag (is-dev))))))

(defn build-prod []
  (prn (process/sh "npx vite build ./build/dev --outDir ../prod")))

(defn build []
  (setup-directories)
  (build-cljs)
  (build-html)
  (when (not (is-dev)) (build-tailwind))
  (when (not (is-dev)) (build-prod)))

(build)