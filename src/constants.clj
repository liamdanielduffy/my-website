(ns constants
  (:require [utils :as u]
            [clojure.string :as s]
            [hiccup2.core :as h]))

(def charset "UTF-8")
(def viewport-content "width=device-width, initial-scale=1")
(def tailwind-styles-path "./tailwind.css")
(def favicon-emoji "✨")
(def import-map-shim-url "https://ga.jspm.io/npm:es-module-shims@1.8.2/dist/es-module-shims.js")

(def packages
  {"preact" "preact@10.19.2"
   "squint-cljs" "squint-cljs@0.5.86"})

(def import-map (u/get-import-map-json))