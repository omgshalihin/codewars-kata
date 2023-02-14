package closestEnemy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ClosestEnemy2 {
    public static String ClosestEnemy(String[] strArr) {
        for (var a : strArr) {
            System.out.println(a);
        }
        return Arrays.toString(strArr);
    }


    public static void main(String[] args) {
        System.out.println(ClosestEnemy(new String[] {"000", "100", "200"}));
    }
}
