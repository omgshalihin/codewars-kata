package findWordInString;

import java.util.Arrays;

public class Kata {

    static Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};

    public static String findNeedle(Object[] haystack) {
        return String.format("found needle: %d", Arrays.asList(haystack).indexOf("needle"));
    }

    public static void main(String[] args) {
        String a = Kata.findNeedle(haystack1);
        System.out.println(a);
    }
}
