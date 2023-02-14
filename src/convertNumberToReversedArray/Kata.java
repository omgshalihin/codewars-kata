package convertNumberToReversedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    public static int[] digitize(long n) {
        StringBuilder sb = new StringBuilder();
        int[] result = sb.append(n).reverse().chars().map(data -> Character.getNumericValue(data)).toArray();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231)));
    }
}
