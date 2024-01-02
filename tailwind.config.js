/** @type {import('tailwindcss').Config} */
module.exports = {
  darkMode: 'class',
  content: ["./build/draft/**/*.html"],
  theme: {
    extend: {},
  },
  plugins: [require('@tailwindcss/typography')],
}

