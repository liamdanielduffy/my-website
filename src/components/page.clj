(ns components.page
  (:require
   [components.head :as head]
   [components.body :as body]))

(def html-tag
  [:html {:lang "en" :class "h-screen w-screen bg-slate-900"}
   head/tag
   body/tag])  