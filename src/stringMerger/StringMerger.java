package stringMerger;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.stream.Stream;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {

        if (s.length() != part1.length() + part2.length()) {
            return false;
        }

        for (int i = 0; i < part1.length(); i++) {
            var charsPart1 = part1.toCharArray();
            System.out.println(charsPart1[i]);
        }

        return false;
    }
}
