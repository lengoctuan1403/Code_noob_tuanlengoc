(ns clojure-noob.bubblesort)



(defn switch
  [a]
  (if (< (a 0) (a 1))
    a
    [(a 1) (a 0)]))



(concat (switch (subvec [10 5 9 76 85 2] 0 2)) (subvec [10 5 9 76 85 2] 2))

  (def ls [5 4 2 5 2])
(defn bubble-sort
  []
  (loop [i0 0
         i2 2]
    (if (< i2 (count ls))
      (do
        (println (concat [] (switch (subvec ls i0 i2))))
        (recur (inc i0) (inc i2))))))

(bubble-sort)


(subvec [1 5 9 76 85 2] 0 2)








(defn add-to-endlist
  []
  (let [new-list []]
    (conj new-list (apply max ds))))

(loop [ds [1 4 5 10 6 3 -2]
       new-list []]
  (recur (conj new-list (apply max ds))
         (remove ds (apply max ds))))










(defn swap [a] (if (> (a 1) (a 0)) a [(a 1) (a 0)]))
(defn swap-at
  [s ith]
  (vec (concat (subvec s 0 ith)
               (swap (subvec s ith (+ ith 2)))
               (subvec s (+ ith 2)))))
(swap-at [1 3 2] 1)
