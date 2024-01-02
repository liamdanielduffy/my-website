(ns components)

(def charset-config
  [:meta {:charset "UTF-8"}])

(def tailwind-stylesheet
  [:link {:href " ./tailwind.css " :rel " stylesheet "}])

(def viewport-config
  [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}])

(def head-tag
  [:head {:title "Liam Duffy"}
   charset-config
   viewport-config
   tailwind-stylesheet])

(def sunset
  [[:div {:class "h-2 bg-amber-200"}]
   [:div {:class "h-2 bg-amber-300"}]
   [:div {:class "h-2 bg-amber-400"}]
   [:div {:class "h-2 bg-amber-500"}]
   [:div {:class "h-2 bg-amber-600"}]
   [:div {:class "h-2 bg-amber-700"}]
   [:div {:class "h-2 bg-slate-800"}]])

(def body-tag
  (vec (concat
        [:body]
        sunset
        [[:p {:class "text-3xl m-2"} "🌻"]])))

(def html-tag
  [:html {:lang "en" :class "bg-slate-900"}
   head-tag
   body-tag])