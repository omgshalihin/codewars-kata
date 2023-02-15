package getMiddleCharacter;

import java.util.Arrays;
import java.util.stream.Stream;

public class Kata {

    public static String getMiddle(String word) {

//        //my solution
//        boolean validateBoolean = word.length() % 2 == 0;
//        int middleLength = word.length() / 2;
//        StringBuilder middleLetter = new StringBuilder(word);
//        return validateBoolean ? middleLetter.substring(middleLength - 1, middleLength + 1) : middleLetter.substring(middleLength, middleLength + 1);

        //refactored
        int length = word.length();
        return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);

    }

    public static void main(String[] args) {
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("testing"));
    }
}
