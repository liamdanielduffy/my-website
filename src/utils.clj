(ns utils
  (:require [clojure.string :as s]
            [hiccup2.core :as h]))

(defn get-import-map-json [packages]
  (let [base-url "https://unpkg.com/"
        imports (mapcat (fn [[k v]]
                          [[k (str base-url v)]
                           [(str k "/") (str base-url v "/")]])
                        packages)
        key-value-pairs (map #(str \" (first %) "\":\"" (second %) \") imports)
        import-object-contents (s/join "," key-value-pairs)
        import-object (str "{ \"imports\": {" import-object-contents "}}")]
    (h/raw import-object)))