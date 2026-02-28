import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 *
 * UC8: Use Map for Character Patterns and Render via Function
 *
 * @author Niraj Pingale
 * @version 8.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        renderBanner("OOPS", patternMap);
    }

    /**
     * Builds and returns character pattern map
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****   ",
                " *     *  ",
                "*       * ",
                "*       * ",
                "*       * ",
                " *     *  ",
                "  *****   "
        });

        map.put('P', new String[]{
                " ******   ",
                " *     *  ",
                " *     *  ",
                " ******   ",
                " *        ",
                " *        ",
                " *        "
        });

        map.put('S', new String[]{
                " ******  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });

        return map;
    }

    /**
     * Renders banner message
     */
    public static void renderBanner(String message, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line);
        }
    }
}