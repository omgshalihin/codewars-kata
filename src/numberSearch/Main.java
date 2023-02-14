package numberSearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    public static String NumberSearch(String str){
        String[] stringArray = str.split("");
        var apple = Arrays.stream(stringArray).sorted(Comparator.comparing(data -> data.replaceAll("[^0-9]", ""))).reduce((a,b) -> a+b).get();
        var checkForIntegers = Arrays.stream(stringArray).anyMatch(i -> i.matches("[0-9]"));
        if (!checkForIntegers) {
            return String.valueOf(0);
        }
        var onlyLetters = apple.replaceAll("[^a-zA-Z]", "");
        var letterLength = onlyLetters.length();
        var onlyNumbersArray = apple.replaceAll("[^0-9]", "").split("");
        var subTotal = Arrays.stream(onlyNumbersArray).mapToDouble(Integer::parseInt).sum();
        double result = subTotal/letterLength;
        return String.valueOf(Math.round(result));
    }

    public static void main(String[] args) {
        System.out.println(NumberSearch("Hello6 9World 2, Nic8e D7ay!"));
//        1. For input "Two Houses" the output was incorrect. The correct output is 0
        System.out.println(NumberSearch("Two Houses"));
    }
}
