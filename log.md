### 2023-12-31

- Figured out how to run an nREPL server via Babashka, [docs](https://book.babashka.org/#_nrepl)

- Setup a deployment using GitHub actions. The workflow uses [this github action](https://github.com/turtlequeue/setup-babashka) to setup Babashka, runs the build.bb script, then deploys with the Vercel CLI.

- Setup local scripts for rebuilding site every time `src` changes, for serving the site locally, and for refreshing the browser whenever `src` changes