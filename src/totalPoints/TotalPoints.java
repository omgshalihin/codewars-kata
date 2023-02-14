package totalPoints;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TotalPoints {

    public static int points(String[] games) {
        int sum = 0;
        for (String game : games) {
            char x = game.charAt(0);
            char y = game.charAt(2);
            sum += x > y ? 3 : x == y ? 1 : 0;
        }
        return sum;

//        Arrays.stream(games)
//                .forEach(System.out::println);
//
//        int sum = Arrays.stream(games)
//                .mapToInt(score -> score.charAt(0) - score.charAt(2))
//                .map(matchPoints -> matchPoints > 0 ? 3 : matchPoints == 0 ? 1 : 0)
//                .sum();
//        return sum;
    }

    public static void main(String[] args) {
        System.out.println(points(new String[]{"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"}));
    }
}
