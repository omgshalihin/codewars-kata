package vowelCount;

import java.util.Arrays;

public class Vowels {

    public static int getCount(String str) {
//        var stringArray = str.split("");
//        var vowelCount = Arrays.stream(stringArray)
//                .filter(letter -> letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
//                .count();
//        return (int) vowelCount;
        var a = str.replaceAll("[^aeiou]", "");
        return a.length();
    }

    public static void main(String[] args) {
        System.out.println(getCount("pear tree"));
    }
}
