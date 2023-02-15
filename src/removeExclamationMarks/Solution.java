package removeExclamationMarks;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }

    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("Hello World!"));
    }
}
