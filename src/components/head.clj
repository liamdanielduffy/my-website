(ns components.head
  (:require [constants :as c]))

(def title-tag
  [:title c/name])

(def charset-meta-tag
  [:meta {:charset c/charset}])

(def tailwind-stylesheet
  [:link {:href c/tailwind-styles-path :rel "stylesheet"}])

(def viewport-meta-tag
  [:meta {:name "viewport" :content c/viewport-content}])

(def google-fonts-preconnect
  [:link {:rel "preconnect" :href c/fonts-google-api-url}])

(def gstatic-preconnect
  [:link {:rel "preconnect" :href c/fonts-google-static-url :crossorigin ""}])

(def jetbrains-mono-stylesheet
  [:link {:rel "stylesheet" :href c/fonts-jetbrains-url}])

(def script [:script {:type "module" :src c/script-path}])

(def favicon
  [:link {:rel "icon" :href c/favicon-emoji}])

(def tag
  [:head
   title-tag
   charset-meta-tag
   viewport-meta-tag
   tailwind-stylesheet
   script
   favicon
   google-fonts-preconnect
   gstatic-preconnect
   jetbrains-mono-stylesheet])