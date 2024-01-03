/** @type {import('tailwindcss').Config} */
module.exports = {
  darkMode: 'class',
  content: ["./build/dev/**/*.html"],
  theme: {
    extend: {},
  },
  plugins: [require('@tailwindcss/typography')],
}