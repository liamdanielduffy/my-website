## Setup

Install [Babashka](https://github.com/babashka/babashka#installation), a Clojure interpreter for scripting

To serve the site locally and watch for file changes, `npm run dev`

To build the site manually, `npm run build`

Use `bb nrepl-server` to run a REPL server for `clj` files

Use `nbb nrepl-server` to run a REPL server for `cljs` files

## Log

This is a daily log of my progress building this project.

## TODO

- replace import maps + custom build / dev with vite

- add log for 2024-01-02

- implement sun-aware theme with sunrise-sunset-js

- Fix intermittent "Layout was forced before the page was fully loaded. If stylesheets are not yet loaded this may cause a flash of unstyled content."

- Make sure Javascript is minified

### 2024-01-02

- Replaced `yarn` with `bun` as the package manager

- Added [preact](https://preactjs.com/) for simple interactivity via [import maps](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/script/type/importmap). Included support for import maps in older browsers with [es-module-shims](https://github.com/guybedford/es-module-shims)  

- Moved constants for site config to a `constants.clj` file. Added a util for building import map JSON to `utils.clj`

- Added [squint](https://github.com/squint-cljs/squint) to compile Clojurescript to Javascript, roughly following [this guide](https://blog.michielborkent.nl/squint-cloudflare-bun.html)

### 2024-01-01

- Added a `dev` script which uses `npm-run-all` to run the site locally with auto-rebuilding when `src` changes

- Found a bug during `dev` where re-building `index.html` would immediately trigger a browser refresh before `tailwind.css` was built, leading to styles that were "off-by-one-refresh". I updated my build script to first build everything in a `build/draft` folder, then copy the contents of `build/draft` into `build/final`. `dev` now watches `build/final` for changes. This means `dev` now sees all new build files at the same time.

- Added a script within `dev` to run an nREPL via `bb nrepl-server`

- Designed a cool header for the site. It kind of reminds me of a cornice. It's interesting that architecture used to have lots of cornices, but modern architecture [got rid of them](https://drawingmatter.org/the-cornice-the-edge-of-architecture/). Websites were born after modern architecture became dominant. I wonder if more websites would have flourishes at their top if they had been born in a world where the cornice was still common on buildings. 

 ### 2023-12-31

- Figured out how to run an nREPL server via Babashka, [docs](https://book.babashka.org/#_nrepl)

- Setup a deployment using GitHub actions. The workflow uses [this github action](https://github.com/turtlequeue/setup-babashka) to setup Babashka, runs the `build.bb` script, then deploys with the Vercel CLI.

- Setup local scripts for rebuilding site every time `src` changes, for serving the site locally, and for refreshing the browser whenever `src` changes