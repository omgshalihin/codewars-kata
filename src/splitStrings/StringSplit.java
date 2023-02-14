package splitStrings;

import java.util.Arrays;

public class StringSplit {

    public static String[] solution(String s) {
        String[] k = s.split("(?<=\\G..)");
        for (int i = 0; i < k.length; i++) {
            if (k[i].length() == 0) {
                return k;
            } else if (k[i].length() != 2) {
                k[i] = k[i] + "_";
                System.out.println(Arrays.toString(k));
                return k;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdef"));

    }
}
