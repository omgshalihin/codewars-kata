package reversedSortedInteger;

import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        var apa =  String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        return Integer.parseInt(apa);
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(132654));
    }
}
