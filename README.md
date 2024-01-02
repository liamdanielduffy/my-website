## Setup

Install [Babashka](https://github.com/babashka/babashka#installation), a Clojure interpreter for scripting

To serve the site locally and watch for file changes, `TODO`

To build the site manually, `bb build.bb`

## Log

This is a daily log of my progress building this project.

### 2024-01-01

- Added a `dev` script which uses `npm-run-all` to run the site locally with auto-rebuilding when `src` changes

 ### 2023-12-31

- Figured out how to run an nREPL server via Babashka, [docs](https://book.babashka.org/#_nrepl)

- Setup a deployment using GitHub actions. The workflow uses [this github action](https://github.com/turtlequeue/setup-babashka) to setup Babashka, runs the `build.bb` script, then deploys with the Vercel CLI.

- Setup local scripts for rebuilding site every time `src` changes, for serving the site locally, and for refreshing the browser whenever `src` changes
