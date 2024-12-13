(ns clojure-noob.bbsort)

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


;; (defn bbsort
;;   [ls]
;;   (loop [ith 0
;;          upd ls]
;;     (if (<= (+ ith 2) (count ls))
;;       (do
;;         (switch-at upd ith)
;;         (recur (inc ith) (replace upd (switch-at upd ith))))
;;        upd)))

(bbsort (bbsort (bbsort [10 9 8 7])))

(bbsort [10 9 8 7])

(defn bbsort-legit
  [ls]

  (loop [upd ls]
    (if ()
     (do
       (bbsort upd)
       (recur (replace upd (bbsort upd)))))))

(bbsort-legit [10 9 8 7])

(count [1 2 3])

(switch-at
 (switch-at
  (switch-at
   (switch-at
    (switch-at
     (switch-at [10 9 8 7] 0) 1) 2) 0) 1) 0)


(defn test[a b]
(if (<= a b)
  (println "ok")
  (println "ko ok")))

(test 6 5)


  (replace [1 2 10 9] [4 7 6])




(defn bbsort
  [ls]
  (loop [ith 0
         upd ls]
    (if (<= (+ ith 2) (count ls))
      (do
        (switch-at upd ith)
        (recur (inc ith) (replace upd (switch-at upd ith))))
      (loop [upd2 upd]
        (if (> (upd2 0) (apply min ls))
          (do
            (bbsort upd2)
            (recur (replace upd2 (bbsort upd2))))
          upd2)))))
  
  (bbsort [4 3 2 1 23])




(if (= ([ 8 7 9] 0) (apply min [8 7 9]))
  (println "ok")
  )