(ns components
  (:require [constants :as c]))

(def title-tag
  [:title "Liam Duffy"])

(def charset-meta-tag
  [:meta {:charset c/charset}])

(def tailwind-stylesheet
  [:link {:href c/tailwind-styles-path :rel "stylesheet"}])

(def viewport-meta-tag
  [:meta {:name "viewport" :content c/viewport-content}])

(def import-map-shim-script
  [:script {:async true :src c/import-map-shim-url}])

(def import-map-tag
  [:script {:type "importmap"} c/import-map])

(def script [:script {:type "module" :src "./script.js"}])

(def favicon
  [:link {:rel "icon" :href (str "data:image/svg+xml,<svg xmlns=%22http://www.w3.org/2000/svg%22 viewBox=%2210 0 100 100%22><text y=%22.90em%22 font-size=%2290%22>" c/favicon-emoji "</text></svg>")}])


(def head-tag
  [:head
   title-tag
   charset-meta-tag
   viewport-meta-tag
   tailwind-stylesheet
   import-map-shim-script
   import-map-tag
   script
   favicon])

(def gradient
  [:div
   [:div {:class "h-2 bg-blue-600 "}]
   [:div {:class "h-2 bg-blue-700"}]
   [:div {:class "h-2 bg-blue-800"}]
   [:div {:class "h-2 bg-blue-900"}]])

(def name
  [:div {:class "p-4 sm:p-8"}
   [:a {:href "/" :class "font-serif text-2xl text-indigo-100 inline-block"}
    "✨"
    [:span
     {:class "ml-1 pb-0 border-dotted border-indigo-300 border-b-2"}
     "Liam Duffy"]]])

(def body-tag
  [:body
   gradient
   name])

(def html-tag
  [:html {:lang "en" :class "bg-slate-900"}
   head-tag
   body-tag]) 