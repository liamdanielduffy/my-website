(ns components)

(def charset-config
  [:meta {:charset "UTF-8"}])

(def tailwind-stylesheet
  [:link {:href "./tailwind.css" :rel "stylesheet"}])

(def viewport-config
  [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}])

(def alpine-library
  [:script {:defer true :src "https://cdn.jsdelivr.net/npm/alpinejs@3.x.x/dist/cdn.min.js"}])

(def head-tag
  [:head {:title "Liam Duffy"}
   charset-config
   viewport-config
   tailwind-stylesheet
   alpine-library])

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