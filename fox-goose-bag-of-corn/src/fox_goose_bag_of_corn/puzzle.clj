(ns fox-goose-bag-of-corn.puzzle)

(def start-pos [[[:fox :goose :corn :you] [:boat] []]])


(defn river-crossing-plan []
  '((#{:you :fox :goose :corn} #{:boat} #{})
    (#{:fox :corn} #{:you :boat :goose} #{})
    (#{:fox :corn} #{:boat} #{:you :goose})
    (#{:fox :corn} #{:you :boat} #{:goose})
    (#{:you :fox :corn} #{:boat} #{:goose})
    (#{:corn} #{:you :fox :boat} #{:goose})
    (#{:corn} #{:boat} #{:you :fox :goose})
    (#{:corn} #{:you :boat :goose} #{:fox})
    (#{:you :goose :corn} #{:boat} #{:fox})
    (#{:goose} #{:you :boat :corn} #{:fox})
    (#{:goose} #{:boat} #{:you :fox :corn})
    (#{:goose} #{:you :boat} #{:fox :corn})
    (#{:you :goose} #{:boat} #{:fox :corn})
    (#{} #{:you :boat :goose} #{:fox :corn})
    (#{} #{:boat} #{:you :fox :goose :corn})))

