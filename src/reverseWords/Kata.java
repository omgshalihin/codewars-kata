package reverseWords;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static String reverseWords(final String original)
    {
        List<String> wordsList = new ArrayList<>(List.of(original.split(" ")));
        return wordsList.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("This is an example!"));
//        System.out.println(reverseWords("double  spaces"));
//        System.out.println(reverseWords("ehT kciuq nworb xof spmuj revo eht yzal .god"));
//        System.out.println(reverseWords("elppa"));
//        System.out.println(reverseWords("a b c s"));
    }
}
