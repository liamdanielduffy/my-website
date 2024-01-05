(ns components.nav)

(def gradient
  [:div
   [:div {:class "h-2 bg-blue-600 "}]
   [:div {:class "h-2 bg-blue-700"}]
   [:div {:class "h-2 bg-blue-800"}]
   [:div {:class "h-2 bg-blue-900"}]])

(def name
  [:div {:class "ml-4 mt-4"}
   [:a {:href "/" :class "font-mono text-xl sm:text-2xl text-indigo-100 inline-block"}
    "✨"
    [:span
     {:class "italic ml-1 pb-0 border-dotted border-indigo-300 border-b-2"}
     "Liam Duffy"]]])