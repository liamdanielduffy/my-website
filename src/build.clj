(ns build
  (:require [components :as c]
            [hiccup2.core :as h]))

(defn build-html []
  (let [page [:html {:lang "en"} c/head-tag c/body-tag]
        html (h/html page)]
    html))

