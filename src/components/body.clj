(ns components.body
  (:require [constants :as c]
            [components.nav :as nav]))

(def space " ")

(def top-margin "sm:mt-8 mt-4")

(defn highlight [content color]
  [:span {:class (str "text-" color)} content])

(def title
  [:span {:class "mt-4 text-5xl text-gray-900 font-garamond max-w-lg"} "My name is" space "Liam Duffy. I'm a software engineer from Brooklyn."])

(defn paragraph [& content]
  [:p {:class "text-slate-900 text-xl sm:text-2xl text-serif mt-8 max-w-sm sm:max-w-lg"} content])

(defn link [content color href]
  [:a {:target "_blank" :rel "noopener noreferrer" :href href :class (str "border-b-2 border-dotted" space "border-" color space "text-" color space "text-3xl font-chicago whitespace-nowrap")} content])

(defn nowrap [content]
  [:span {:class "whitespace-nowrap"} content])

(def read-my-resume
  [:a {:href "/resume.pdf" :target "_blank" :rel "noopener noreferrer" :class "mt-8 mb-10 rounded p-2 bg-amber-400 text-amber-900 justify-self-start"}
   [:span {:class "bg-yellow-200 text-amber-900 rounded p-1 mr-2"}
    "Hiring?"]
   "Read my résumé ->"])

(def flowcode-summary
  (paragraph "I was an early engineer at" space
             (link "Flowcode" "blue-400" c/flowcode-url)
             \, space "a QR-code builder used by most of the Fortune 1000."))

(def socialstar-summary
  (paragraph "Before that, I was on the founding team of" space
             (link "Social Star" "green-500" c/social-star-url)
             \, space "a volunteering platform for one of India's largest non-profits."))

(def juggernaut-summary
  (paragraph "I built and launched the first version of" space
             (link "The Juggernaut" "orange-400" c/thejuggernaut-url)
             \, space "a Y-Combinator-backed publication for South Asian journalism."))

(def content
  [:div {:class "pt-12 px-6 sm:px-8 font-sans text-slate-800 flex flex-col sm:items-center"}
   [:span {:class "text-5xl"} "🚲🌳🏙️"]
   [:p {:class "text-7xl font-garamond mt-6"} "Hello, world!"]
   title
   flowcode-summary
   socialstar-summary
   juggernaut-summary])

(def tag
  [:body {:class "min-h-screen min-w-screen bg-gray-100"}
   nav/gradient
   content])