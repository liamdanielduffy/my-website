### 2023-12-31

- figured out how to run an nREPL server via Babashka, [link to docs](https://book.babashka.org/#_nrepl)

- to keep site deployment simple, I'll run a deploy script locally when I want to deploy, and use Vercel to deploy from the CLI

- I also want to be able to auto-rebuild my site in response to changes in src. I assume Babashka has the ability to look in a directory for changes, and run a script in response to those changes. I haven't found it yet though. 