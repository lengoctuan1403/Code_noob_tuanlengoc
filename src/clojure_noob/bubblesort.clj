(ns clojure-noob.bubblesort)



(defn switch
  [a]
  (if (< (a 0) (a 1))
    a
    [(a 1) (a 0)]))
(defn switch-at

  [ls ith]
  (vec (concat (subvec ls 0 ith)
               (switch (subvec ls ith (+ ith 2)))
               (subvec ls (+ ith 2)))))
(apply max [9 8 7 6 5])

(defn bbsort
  [ls]
  (loop [ith 0
         upd ls]
    (if (<= (+ ith 2) (count ls))
      (do
        (switch-at upd ith)
        (recur (inc ith) (replace upd (switch-at upd ith))))
      (loop [upd2 upd]
        (if (= (upd2 0) (apply min ls))
          upd2
          (do
            (bbsort upd2)
            (recur (replace upd2 (bbsort upd2)))))))))




(bbsort [10 9 8 7 6])
;; dang bi stack over flow


(bbsort [2 10 7 6 -3])