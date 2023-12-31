(ns components)

(def charset [:meta {:charset "UTF-8"}])
(def tailwind-link [:link {:href "./tailwind.css" :rel "stylesheet"}])
(def head-tag [:head {:title "Liam Duffy"} charset tailwind-link])

(def title [:h1 {:class "text-3xl"} "A simple webpage"])
(def paragraph [:p {:class "text-xl"} "Made with clojure"])
(def body-tag [:body title paragraph])