package highestScoringWord;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {

    public static String high(String s) {

        String winner = " ";
        int highScore = 0;
        String cleanSentence = s.replaceAll("[^A-Za-z0-9 ]", "");
        String[] wordArray = cleanSentence.split(" ");

        for (String word : wordArray) {
            int score = 0;
            char[] letterArray = word.toCharArray();

            for (char letter : letterArray) {
                score += letter;

                if (score > highScore) {
                    winner = word;
                    highScore = score;
                }
            }
        }
        return winner;
    }
    public static void main(String[] args) {
        System.out.println(high("The quick, brown, fox."));
    }
}
