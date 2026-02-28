/**
 * OOPSBannerApp
 *
 * UC5: Render OOPS as Banner using Inline Array Initialization
 *
 * @author Niraj Pingale
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization with String.join()
        String[] banner = {

                String.join(" ",
                        "  *****   ",
                        "  *****   ",
                        " ******   ",
                        " ******  "),

                String.join(" ",
                        " *     *  ",
                        " *     *  ",
                        " *     *  ",
                        " *     * "),

                String.join(" ",
                        "*       * ",
                        "*       * ",
                        " *     *  ",
                        " *       "),

                String.join(" ",
                        "*       * ",
                        "*       * ",
                        " ******   ",
                        "  *****  "),

                String.join(" ",
                        "*       * ",
                        "*       * ",
                        " *        ",
                        "       * "),

                String.join(" ",
                        " *     *  ",
                        " *     *  ",
                        " *        ",
                        " *     * "),

                String.join(" ",
                        "  *****   ",
                        "  *****   ",
                        " *        ",
                        "  *****  ")
        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}