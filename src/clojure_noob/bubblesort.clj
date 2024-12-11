(ns clojure-noob.bubblesort)





(defn add-to-endlist
  []
  (let [ds [1 4 5 10 6 3 -2]
        new-list []
        value (apply max ds)]
    (conj new-list value)
    (remove ds value)))


(add-to-endlist)


(defn add-to-endlist
  []
  (let [new-list []]
    (conj new-list (apply max ds))))

(loop [ds [1 4 5 10 6 3 -2]
       new-list []]
  (recur (conj new-list (apply max ds))
         (remove ds (apply max ds))))




(def n [])
(let [new-list []]
  (conj new-list (apply max ds)))

(let [value (apply max ds)]
  value)