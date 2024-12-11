(ns clojure-noob.read-file
  (:require [clojure.java.io :refer [reader]]))


(defn read-input
  []
  (with-open [rdr (reader "numbers.txt")]
    (let [lines (line-seq rdr)
          n (-> lines first Integer/parseInt)
          numbers (->> lines rest (take n) (map #(Integer/parseInt %)))]
      (spit "output.txt" "Gia tri lon nhat la ")
      (spit "output.txt" (apply max numbers) :append true))))

(read-input)





(Integer/parseInt "14")
