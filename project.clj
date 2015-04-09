(defproject cljsjs-gl-matrix-test "0.1.0"
  :description "Test project for cljsjs/gl-matrix"
  :url "https://github.com/jenanwise/cljjs-gl-matrix-test"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha6"]
                 [org.clojure/clojurescript "0.0-3169"]
                 [cljsjs/gl-matrix "2.3.0-jenanwise-0"]]
  :plugins [[lein-cljsbuild "1.0.5"]]
  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src"]
                :compiler {:output-to "resources/public/dev/compiled/client.js"
                           :output-dir "resources/public/dev/compiled/out"
                           :asset-path "/compiled/out"
                           :optimizations :none
                           :main cljsjs-gl-matrix-test.core
                           :cache-analysis true}}
               {:id "advanced"
                :source-paths ["src"]
                :compiler {:output-to "resources/public/advanced/compiled/client.js"
                           :optimizations :advanced}}]})
