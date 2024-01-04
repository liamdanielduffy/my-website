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

(def name-placeholder
  [:div {:class "ml-4 mt-4 sm:ml-4 sm:mt-4 hidden"}
   [:a {:href "/" :class "font-mono text-xl sm:text-2xl text-indigo-100 inline-block"}
    "✨"
    [:span
     {:class "italic ml-1 pb-0 border-dotted border-indigo-300 border-b-2"}
     "Liam Duffy"]]])

(def hello-world
  [:span {:class "pt-8 text-4xl sm:text-5xl text-indigo-100"} "Hello, world!"])

(defn paragraph [& content]
  [:p {:class "text-lg sm:text-xl text-serif mt-4 sm:mt-8 max-w-sm sm:max-w-lg"} content])

(defn highlight [content color]
  [:span {:class (str "text-" color)} content])

(def space " ")

(defn link [content color href]
  [:a {:href href :class (str "border-b-2 border-dotted" space "border-" color space "text-" color)} content])

(defn nowrap [content]
  [:span {:class "whitespace-nowrap"} content])

(def about-me
  (paragraph "My name is" space
             (highlight "Liam." "amber-400") space
             "I'm a" space
             (highlight "software engineer" "green-400") space
             "from" space
             (nowrap "Brooklyn, NY.")))

(def read-my-resume
  [:a {:href "/" :class "rounded p-2 bg-amber-400 text-amber-900 font-mono"}
   [:span {:class "bg-yellow-200 text-amber-900 rounded p-1 mr-2"}
    "Hiring?"]
   "Read my résumé ->"])

(def career-summary
  (paragraph "I've built" space
             (highlight "full-stack web apps" "sky-300") space
             "for several" space
             (highlight "early-stage startups." "red-400")))

(def flowcode-summary
  (paragraph "I was one of the first engineers at" space
             (link "Flowcode" "purple-400" c/flowcode-url)
             \, space "a QR-code builder used by most of the Fortune 1000."))

(def socialstar-summary
  (paragraph "Before that, I was on the founding team of" space
             (link "Social Star" "pink-400" c/social-star-url)
             \, space "a volunteering platform for one of India's largest non-profits."))

(def juggernaut-summary
  (paragraph "I built and launched the first version of" space
             (link "The Juggernaut" "orange-400" c/thejuggernaut-url)
             \, space "a Y-Combinator-backed publication for South Asian journalism."))


(def content
  [:div {:class "px-6 sm:px-8 py-8 sm:py-12 font-mono text-indigo-100 flex flex-col sm:items-center"}
   read-my-resume
   hello-world
   about-me
   career-summary
   flowcode-summary
   socialstar-summary
   juggernaut-summary])

(def body-tag
  [:body {:class "h-screen w-screen bg-gradient-to-t from-slate-800 to-slate-900"}
   gradient
   name
   content])

(def html-tag
  [:html {:lang "en" :class "h-screen w-screen bg-slate-900"}
   head-tag
   body-tag])  