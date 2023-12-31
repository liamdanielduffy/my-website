### 2023-12-31

- Figured out how to run an nREPL server via Babashka, [link to docs](https://book.babashka.org/#_nrepl)

- Setup a deployment using GitHub actions. The workflow uses [this github action](https://github.com/turtlequeue/setup-babashka) to setup Babashka, runs the build.bb script, then deploys with the Vercel CLI.

- I also want to be able to auto-rebuild my site in response to changes in src. I assume Babashka has the ability to look in a directory for changes, and run a script in response to those changes. I haven't found it yet though. 