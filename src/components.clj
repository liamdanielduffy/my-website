(ns components)

(def charset [:meta {:charset " UTF-8 "}])
(def tailwind-link [:link {:href " ./tailwind.css " :rel " stylesheet "}])
(def head-tag [:head {:title " Liam Duffy "} charset tailwind-link])

(def test-typography [:article {:class " prose lg:prose-xl "}
                      [:h1 " Garlic bread with cheese What the science tells us "]])
(def body-tag [:body test-typography]) 