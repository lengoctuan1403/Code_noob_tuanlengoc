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
        (recur (inc ith) (switch-at upd ith))
      upd)))

(max-to-end [10000 9 8 -7000 6 5 4])

(defn bbsort
  [ls]
  (loop [ times 1
         new-ls ls]
    (if (< times (count ls))
        (recur (inc times) (max-to-end new-ls))
      new-ls)))

(bbsort [-2 0 -2000 100 3 1])

(bbsort [10 9 8 7 6])

(replace [1 3 5 6 8 9 6543 2] [1 3])