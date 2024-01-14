(ns components.nav)

(def gradient
  [:div
   [:div {:class "h-2 bg-green-500 "}]
   [:div {:class "h-2 bg-green-400"}]
   [:div {:class "h-2 bg-green-300"}]
   [:div {:class "h-2 bg-green-200"}]])

(def resume
  [:a {:href "/resume.pdf" :class "inline-block font-chicago text-xl border-b-2 border-dotted border-slate-900"} "Resume"])