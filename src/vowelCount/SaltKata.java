package vowelCount;

import java.util.Arrays;
import java.util.List;

public class SaltKata {
    public static List<String> getWord(String word1, String word2){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        var word1SplitVowel = word1.split("(?<=[aeiou])");
        var word1IndexFirst = word1SplitVowel[0];
        for (int i = 1; i < word1SplitVowel.length; i++) {
            sb1.append(word1SplitVowel[i]);
        }

        var word2SplitVowel = word2.split("(?<=[aeiou])");
        var word2IndexFirst = word2SplitVowel[0];
        for (int i = 1; i < word2SplitVowel.length; i++) {
            sb2.append(word2SplitVowel[i]);
        }

        var result1 = word1IndexFirst + sb2;
        var result2 = word2IndexFirst + sb1;
        return List.of(result1, result2);
    }
}
