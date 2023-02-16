package powersOf2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class Kata {
    public static long[] powersOfTwo(int n) {
        return LongStream.rangeClosed(0, n)
                .map(i -> (long) Math.pow(2, i))
                .toArray();
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(0)));
        System.out.println(Arrays.toString(powersOfTwo(1)));
        System.out.println(Arrays.toString(powersOfTwo(2)));
    }
}
