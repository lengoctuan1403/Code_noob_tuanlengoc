(ns clojure-noob.quicks)

(def ls [10 6 8 21 3 100 70])
(defn pick-pivot
  [ls]
  (ls 0))

(pick-pivot [7 8 9])

(defn pick-big
  [ls]
  (loop [ith 1
         bigger []]
    (if (< ith (count ls)) ;; điều kiện thoát loop
      (let [pivot (pick-pivot ls)
            value (ls ith)]
        (println "Update: " bigger)
        (println "Gia tri la: " value)
        (recur (inc ith) (if (> value pivot)
                           (conj bigger value)
                           bigger)))
      bigger)))
(defn pick-small
  [ls]
  (loop [ith 1
         smaller []]
    (if (< ith (count ls)) ;; điều kiện thoát loop
      (let [pivot (pick-pivot ls)
            value (ls ith)]
        (println "Update: " smaller)
        (println "Gia tri la: " value)
        (recur (inc ith) (if (< value pivot)
                           (conj smaller value)
                           smaller)))
      smaller)))

(pick-big ls)

(pick-small ls)

(defn qsort
  [ls]
  (pick-small ls))




(defn qsort
  [ls]
  (loop [ith 1
         bigger []
         smaller []]
    (if (< ith (count ls)) ;; điều kiện thoát loop
      (let [pivot (pick-pivot ls)
            value (ls ith)]
        (println "Update bigger: " bigger)
        (println "Update smaller: " smaller)
        (println "Gia tri la: " value)
        (recur (inc ith)
               (if (> value pivot) (conj bigger value) bigger)
               (if (< value pivot) (conj smaller value) smaller)))
      smaller)))




(qsort [10 6 20 8 13 23])

