(ns components
  (:require [hiccup2.core :as h]))

(def charset-config
  [:meta {:charset "UTF-8"}])

(def tailwind-stylesheet
  [:link {:href "./tailwind.css" :rel "stylesheet"}])

(def viewport-config
  [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}])

(def import-map-shim
  [:script {:async true :src "https://ga.jspm.io/npm:es-module-shims@1.8.2/dist/es-module-shims.js"}])

(def import-map
  [:script {:type "importmap"}
   (h/raw
    " 
    { \"imports\": {
      \"preact\": \"https://esm.sh/preact@10.19.2\",
      \"preact/\": \"https://esm.sh/preact@10.19.2/\"
    }}")])

(def test-script
  [:script {:type "module"}
   (h/raw "import { render } from \"preact\"; console.log(render);")])

(def head-tag
  [:head {:title "Liam Duffy"}
   charset-config
   viewport-config
   tailwind-stylesheet
   import-map-shim
   import-map
   test-script])

(def gradient
  [:div
   [:div {:class "h-2 bg-blue-600 "}]
   [:div {:class "h-2 bg-blue-700"}]
   [:div {:class "h-2 bg-blue-800"}]
   [:div {:class "h-2 bg-blue-900"}]])

(def body-tag
  [:body
   gradient
   [:div {:class "flex p-4 sm:p-8 justify-between"}
    [:a
     {:href "/" :class "font-serif text-2xl text-indigo-100 inline-block"}
     "✨"
     [:span
      {:class "ml-1 pb-0 border-dotted border-indigo-300 border-b-2"}
      "Liam Duffy"]]]])

(def html-tag
  [:html {:lang "en" :class "bg-slate-900"}
   head-tag
   body-tag])