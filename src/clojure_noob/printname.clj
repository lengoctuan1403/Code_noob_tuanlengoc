(ns clojure-noob.printname)

(defn printmyname
  []
  (println "My name is Tuan"))

(printmyname)

(defn printyourname
  [yourname]
  (println "Your name is" yourname))

(printyourname "Phong ml")

(defn printrandomname
  []
  (println "Nhap nam sinh cua ban: ")
  (let [year (Integer/parseInt (read-line))]
    (println year)
    (println "Ban" (- 2024 year) "tuoi roi")))

(printrandomname)

(println "Hoan thanh, chuan bi merge")