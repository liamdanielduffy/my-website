### 2023-12-31

- figured out how to run an nREPL server via Babashka, [link to docs](https://book.babashka.org/#_nrepl)

- researching how to setup a GitHub action to build + deploy the site
	- found [this](https://github.com/marketplace/actions/babashka-clojure) GitHub action that allows me to run a Babashka script
	- found [this](https://github.com/cloudflare/pages-action) GitHub action that allows me to deploy a Cloudflare Pages site after running a build step
	- combining the two should allow me to build my site with Babashka, then deploy it using Cloudflare Pages

- I also want to be able to auto-rebuild my site in response to changes in src. I assume Babashka has the ability to look in a directory for changes, and run a script in response to those changes. I haven't found it yet though. 