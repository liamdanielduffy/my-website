(require '[babashka.process :as process]
         '[hiccup2.core :as h]
         '[components.page :as p]
         '[babashka.cli :as cli])

(defn is-dev []
  (let [flags (:opts (cli/parse-args *command-line-args*))
        is-dev (:dev flags)]
    is-dev))

(defn setup-directories []
  (process/sh "mkdir build build/dev build/dev/public")
  (when (not (is-dev)) (process/sh "mkdir build/prod")))

(defn build-tailwind []
  (process/sh "bun tailwindcss build -i tailwind.css -o build/dev/tailwind.css --minify"))

(defn build-cljs []
  (process/sh "bun squint compile src/script.cljs"))

(defn build-html []
  (spit "build/dev/index.html" (str "<!doctype html>" (h/html p/html-tag))))

(defn build-prod []
  (process/sh "bun vite build ./build/dev --outDir ../prod"))

(defn copy-public []
  (process/sh "bash" "-c" "cp -r ./public/* build/dev/public"))


(defn build []
  (setup-directories)
  (copy-public)
  (build-cljs)
  (build-html)
  (build-tailwind)
  (when (not (is-dev)) (build-prod)))

(build)