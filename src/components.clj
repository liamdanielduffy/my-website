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

(def cornice
  [[:div {:class "h-2 bg-amber-100"}]
   [:div {:class "h-2 bg-amber-500"}]
   [:div {:class "h-2 bg-amber-200"}]
   [:div {:class "h-2 bg-amber-400"}]
   [:div {:class "h-2 bg-amber-300"}]
   [:div {:class "h-2 bg-amber-600"}]
   [:div {:class "h-2 bg-slate-900"}]
   [:div {:class "border-b-4 border-amber-400 border-dotted"}]])

(def body-tag
  (vec (concat
        [:body]
        cornice)))

(def html-tag
  [:html {:lang "en" :class "bg-slate-800"}
   head-tag
   body-tag])