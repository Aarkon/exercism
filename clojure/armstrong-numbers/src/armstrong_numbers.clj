(ns armstrong-numbers
  (:require [clojure.string :as str]))

(defn armstrong? [num]
  (let [chars (str/split (str num) "")])
  (let [numbers (read-string chars)])
  (reduce (fn [number] (+ (reduce * (repeat count numbers)))) numbers)
  )

