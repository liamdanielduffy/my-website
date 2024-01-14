/** @type {import('tailwindcss').Config} */
module.exports = {
  darkMode: 'class',
  content: ["./build/dev/**/*.html"],
  theme: {
    extend: {
      fontFamily: {
        mono: ['JetBrains Mono', 'monospace'],
        garamond: ['Garamond', 'serif'],
        chicago: ['Chicago', 'sans-serif']
      }
    },
  },
  plugins: [require('@tailwindcss/typography')],
}