(ns script)

;; script to calculate sunset using https://gml.noaa.gov/grad/solcalc/solareqns.PDF

(defn num-days-in-year [year]
  (let [is-divisible-by-4 (= 0 (mod year 4))]
    (if is-divisible-by-4 366 365)))

(defn calculate-fractional-year [day hour]
  (let [zero-indexed-day (- day 1)
        fraction-of-day (/ (- hour 12) 24)]
    (+ zero-indexed-day fraction-of-day)))