package sumOfNumbers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sum {
    public static int getSum(int a, int b) {
        int[] intArray = new int[]{a,b};
        var sortThis = Arrays.stream(intArray).sorted().toArray();
        return IntStream.rangeClosed(sortThis[0], sortThis[1]).sum();
    }

    public static void main(String[] args) {
        System.out.println(getSum(0,-1));
    }
}
