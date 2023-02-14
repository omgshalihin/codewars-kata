package alternatingString;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringUtils {

    public static String toAlternativeString(String string) {
        return Arrays.stream(string.split(""))
                .map(letter -> letter.matches("[A-Z]") ? letter.toLowerCase() : letter.toUpperCase())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("hello WORLD"));
    }
}
