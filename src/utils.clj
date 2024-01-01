(ns utils
  (:require [components :as c]
            [hiccup2.core :as h]
            [markdown.core :as m]))

(m/md-to-html-string "### Hello")

(defn build-html []
  (let [page [:html {:lang "en" :class "dark"} c/head-tag c/body-tag]
        html (h/html page)]
    html))

