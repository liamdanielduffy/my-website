(ns components)

(def charset-config
  [:meta {:charset " UTF-8 "}])

(def tailwind-stylesheet
  [:link {:href " ./tailwind.css " :rel " stylesheet "}])

(def viewport-config
  [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}])

(def head-tag
  [:head {:title "Liam Duffy"}
   charset-config
   viewport-config
   tailwind-stylesheet])

(def gradient
  [:div
   [:div {:class " h-2 bg-indigo-600 "}]
   [:div {:class " h-2 bg-indigo-700"}]
   [:div {:class " h-2 bg-indigo-800"}]
   [:div {:class " h-2 bg-indigo-900"}]])

(def body-tag
  [:body
   gradient
   [:a {:href "/" :class "font-serif text-2xl text-indigo-100 m-2 sm:m-6 inline-block p-2"} "✨" [:span {:class "ml-1 pb-0 border-dotted border-indigo-300 border-b-2"} "Liam Duffy"]]])

(def html-tag
  [:html {:lang "en" :class "bg-slate-900"}
   head-tag
   body-tag])