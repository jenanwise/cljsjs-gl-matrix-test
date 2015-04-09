# cljsjs-gl-matrix-test

Test project for cljsjs/gl-matrix.


## Running

Build either the `advanced` or `dev` (optimizations `:none`) cljsbuild
target and view the dev console when browsing to one of the provided
`index.html` files.

For example:

```bash
lein cljsbuild once advanced
cd resources/public/advanced
python -m SimpleHTTPServer
# then browse to http://localhost:8000
```

You should see something like this in the dev console:

```
Hello from CLJS!
vec3(1, 10, 100) + vec3(1, 1, 1) = vec3(2, 11, 101)
```


## License

Copyright © 2015 Jenan Wise.

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
