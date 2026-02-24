import java.util.*;

public class oppsbannerappuc7 {
    
    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getRow(int row) {
            return pattern[row];
        }

        public char getChar() {
            return character;
        }
    }

    public static void main(String[] args) {
    
        Map<Character, CharacterPattern> registry = new HashMap<>();
        registry.put('O', new CharacterPattern('O', new String[]{" @@@ ", "@   @", "@   @", "@   @", " @@@ "}));
        registry.put('P', new CharacterPattern('P', new String[]{"@@@@ ", "@   @", "@@@@ ", "@    ", "@    "}));
        registry.put('S', new CharacterPattern('S', new String[]{" @@@ ", "@    ", " @@@ ", "    @", " @@@ "}));

        String input = "OOPS";
        int bannerHeight = 5;
        int totalWidth = (input.length() * 6) + 4;
        String border = "#".repeat(totalWidth);

       
        String[] banner = new String[7];
        banner[0] = border;
        banner[6] = border;

        for (int i = 0; i < bannerHeight; i++) {
            StringBuilder sb = new StringBuilder("# ");
            for (char c : input.toCharArray()) {
                sb.append(registry.get(c).getRow(i)).append(" ");
            }
            sb.append("#");
            banner[i + 1] = sb.toString();
        }

       
        for (String line : banner) {
            System.out.println(line);
        }
    }
}