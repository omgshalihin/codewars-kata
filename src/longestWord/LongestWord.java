package longestWord;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestWord {
    public static String LongestWord(String sen) {
        var cleanString = sen.replaceAll("[^A-Za-z0-9]+", " ");
        var splitString = cleanString.split(" ");
        return Arrays.stream(splitString)
                .reduce((first, second) -> first.length() > second.length() ? first : second)
                .get();
    }

    public static void main(String[] args) {
        System.out.println(LongestWord("dog turtle!% cat esplandeeee"));
    }
}
