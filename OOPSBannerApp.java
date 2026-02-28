/**
 * OOPSBannerApp
 *
 * UC7: Store Character Pattern in an Inner Static Class
 *
 * @author Niraj Pingale
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to store Character and Pattern
     */
    static class CharacterPattern {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor
         * @param character the letter
         * @param pattern 7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern[] patterns = {

                new CharacterPattern('O', new String[]{
                        "  *****   ",
                        " *     *  ",
                        "*       * ",
                        "*       * ",
                        "*       * ",
                        " *     *  ",
                        "  *****   "
                }),

                new CharacterPattern('P', new String[]{
                        " ******   ",
                        " *     *  ",
                        " *     *  ",
                        " ******   ",
                        " *        ",
                        " *        ",
                        " *        "
                }),

                new CharacterPattern('S', new String[]{
                        " ******  ",
                        " *     * ",
                        " *       ",
                        "  *****  ",
                        "       * ",
                        " *     * ",
                        "  *****  "
                })
        };

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                for (CharacterPattern cp : patterns) {
                    if (cp.getCharacter() == ch) {
                        line.append(cp.getPattern()[row]).append(" ");
                    }
                }
            }

            System.out.println(line);
        }
    }
}