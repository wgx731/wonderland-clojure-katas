(ns tiny-maze.solver)

(defn- neighbors [grid [x y]]
  (remove (comp #{nil 1} (partial get-in grid))
          (map (partial mapv + [x y]) [[1 0] [0 1] [-1 0] [0 -1]])))

(defn- grid->graph [grid]
  (let [coords (for [x (-> grid count range), y (-> grid first count range)] [x y])]
    {:start (first (filter #(= :S (get-in grid %)) coords))
     :end   (first (filter #(= :E (get-in grid %)) coords))
     :graph (->> coords
                 (remove (partial = 1))
                 (map (juxt identity (partial neighbors grid)))
                 (into {}))}))

(defn- dfs [graph goal]
  (fn search [path seen]
    (as-> (peek path) current
          (if (= goal current)
            (list path)
            (->> (graph current)
                 (remove seen)
                 (mapcat  #(search (conj path %) (conj seen %))))))))

(defn- findpath [graph start goal]
  ((dfs graph goal) [start] #{start}))

(defn solve-maze [grid]
  (let [{:keys [start end graph]} (grid->graph grid)]
    (reduce #(assoc-in %1 %2 :x) grid (first (findpath graph start end)))))

