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

(def google-fonts-preconnect
  [:link {:rel "preconnect" :href "https://fonts.googleapis.com"}])

(def gstatic-preconnect
  [:link {:rel "preconnect" :href "https://fonts.gstatic.com" :crossorigin ""}])

(def jetbrains-mono-stylesheet
  [:link {:rel "stylesheet" :href "https://fonts.googleapis.com/css2?family=JetBrains+Mono:ital@0;1&display=swap"}])

(def script [:script {:type "module" :src "./script.js"}])

(def favicon
  [:link {:rel "icon" :href (str "data:image/svg+xml,<svg xmlns=%22http://www.w3.org/2000/svg%22 viewBox=%2210 0 100 100%22><text y=%22.90em%22 font-size=%2290%22>" c/favicon-emoji "</text></svg>")}])

(def head-tag
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

(def gradient
  [:div
   [:div {:class "h-2 bg-blue-600 "}]
   [:div {:class "h-2 bg-blue-700"}]
   [:div {:class "h-2 bg-blue-800"}]
   [:div {:class "h-2 bg-blue-900"}]])

(def name
  [:div {:class "ml-4 mt-4 sm:ml-4 sm:mt-4"}
   [:a {:href "/" :class "font-mono text-xl sm:text-2xl text-indigo-100 inline-block"}
    "✨"
    [:span
     {:class "italic ml-1 pb-0 border-dotted border-indigo-300 border-b-2"}
     "Liam Duffy"]]])

(def hello-world
  [:span {:class "text-3xl sm:text-4xl text-indigo-100"} "Hello, world!"])

(def who-i-am
  [:span {:class "text-lg sm:text-xl text-serif mt-4 sm:mt-8 max-w-sm sm:max-w-lg"}
   "My name is "
   [:span {:class "text-amber-400"} "Liam. "]
   "I'm a "
   [:span {:class "text-green-400"} "software engineer "]
   "from "
   [:span {:class "whitespace-nowrap"} "Brooklyn, NY."]])

(def welcome
  [:div {:class "px-6 sm:px-8 py-12 sm:py-16 font-mono text-indigo-100 flex flex-col sm:items-center"}
   hello-world
   who-i-am])

(def body-tag
  [:body
   [:div {:class "pattern-dots pattern-blue-500 pattern-bg-white 
  pattern-size-6 pattern-opacity-20"}]
   gradient
   name
   welcome])

(def html-tag
  [:html {:lang "en" :class "h-screen w-screen bg-gradient-to-t from-slate-800 to-slate-900"}
   head-tag
   body-tag]) 