(ns components)

(def charset-config
  [:meta {:charset " UTF-8 "}])

(def tailwind-stylesheet
  [:link {:href " ./tailwind.css " :rel " stylesheet "}])

(def viewport-config
  [:meta {:name " viewport " :content " width=device-width, initial-scale=1 "}])

(def head-tag
  [:head {:title " Liam Duffy "}
   charset-config
   viewport-config
   tailwind-stylesheet])

(def gradient
  [:div
   [:div {:class " h-2 bg-indigo-300 "}]
   [:div {:class " h-2 bg-indigo-400 "}]
   [:div {:class " h-2 bg-indigo-500 "}]
   [:div {:class " h-2 bg-indigo-600 "}]
   [:div {:class " h-2 bg-indigo-700"}]
   [:div {:class " h-2 bg-indigo-800"}]
   [:div {:class " h-2 bg-indigo-900"}]
   [:div {:class " h-2 bg-zinc-900"}]])

(def body-tag
  [:body
   gradient])

(def html-tag
  [:html {:lang "en" :class "bg-slate-900"}
   head-tag
   body-tag])