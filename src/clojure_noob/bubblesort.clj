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
(defn max-to-end
  [ls]
  (loop [ith 0
         upd ls]
    (if (<= (+ ith 2) (count ls))
      (do
        (switch-at upd ith)
        (recur (inc ith) (replace upd (switch-at upd ith))))
      upd)))

(max-to-end [10 9 8 7 9 87 6 -1000 -2000 0])

(switch-at [10 9 8 7 9 87 6 -1000 -2000 0] 8)
(count [10 9 8 7 9 87 6 -1000 -2000 0])
 

(defn bbsort
  [ls]
  (loop [new-ls ls]
    (if ()
      new-ls
      (do
        ;;(max-to-end ls)
        (recur (replace new-ls (max-to-end new-ls)))))))



(bbsort [-2 1 3 1])


(loop [upd2 upd]
  (if (= (upd2 0) (apply min ls))
    upd2
    (do
      (bbsort upd2)
      (recur (replace upd2 (bbsort upd2))))))




(bbsort [10 9 8 7 6])
;; dang bi stack over flow


