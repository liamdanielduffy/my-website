(ns components.body
  (:require [constants :as c]
            [components.nav :as nav]))

(def space " ")

(def top-margin "sm:mt-8 mt-4")

(def hello-world
  [:span {:class "text-4xl sm:text-5xl text-indigo-100"} "Hello, world!"])

(defn paragraph [& content]
  [:p {:class "text-lg sm:text-xl text-serif mt-8 max-w-sm sm:max-w-lg"} content])

(defn highlight [content color]
  [:span {:class (str "text-" color)} content])

(defn link [content color href]
  [:a {:target "_blank" :rel "noopener noreferrer" :href href :class (str "border-b-2 border-dotted" space "border-" color space "text-" color)} content])

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
  [:a {:href "/resume.pdf" :class "mt-8 mb-10 rounded p-2 bg-amber-400 text-amber-900 font-mono justify-self-start"}
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
  [:div {:class "px-6 sm:px-8 font-mono text-indigo-100 flex flex-col sm:items-center"}
   read-my-resume
   hello-world
   about-me
   career-summary
   flowcode-summary
   socialstar-summary
   juggernaut-summary])

(def tag
  [:body {:class "min-h-screen min-w-screen bg-gradient-to-t from-slate-800 to-slate-900"}
   nav/gradient
   nav/name
   content])