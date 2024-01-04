/** @type {import('tailwindcss').Config} */
module.exports = {
  darkMode: 'class',
  content: ["./build/dev/**/*.html"],
  theme: {
    extend: {
      fontFamily: {
        'mono': ['JetBrains Mono', 'monospace']
      }
    },
  },
  plugins: [require('@tailwindcss/typography')],
}