(ns read-line-io)

(defn input
  []
  (println "Nhap vao so phan tu: " n
  (let [n (Integer/parseInt (read-line))]
    (println "Nhap vao so phan tu: " n)
    (loop [i 0
           input-list []]
      (if (< i n)
        (do
          (println "Nhap gia tri thu " (+ i 1) ":")
          (let [value (Integer/parseInt (read-line))]
            (recur (inc i) (conj input-list value))))
        (do
          (println "Gia tri lon nhat la: " (apply max input-list))
          (println "Gia tri nho nhat la: " (apply min input-list))))))))

(input)