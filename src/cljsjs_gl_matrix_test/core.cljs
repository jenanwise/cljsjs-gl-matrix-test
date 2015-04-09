(ns cljsjs-gl-matrix-test.core
  (:require [cljsjs.gl-matrix]))

(enable-console-print!)

(println "Hello from CLJS!")

(let [v1 (.fromValues js/vec3 1 10 100)
      v2 (.fromValues js/vec3 1 1 1)
      v3 (.create js/vec3)]
  (.add js/vec3 v3 v1 v2)
  (println (.str js/vec3 v1)
           "+"
           (.str js/vec3 v2)
           "="
           (.str js/vec3 v3)))
