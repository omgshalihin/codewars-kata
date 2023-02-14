package highestProfit;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinMax {
    public static int[] minMax(int[] arr) {
        var max = IntStream.of(arr).max().getAsInt();
        var min = IntStream.of(arr).min().getAsInt();

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        System.out.println(minMax(new int[]{1, 2, 3, 4, 5}));
    }
}
