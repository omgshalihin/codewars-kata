package returnNegative;

import static java.lang.Math.abs;

public class Kata {

    public static int makeNegative(final int x) {
        return -abs(x);

    }

    public static void main(String[] args) {
        Kata k = new Kata();
        System.out.println(k.makeNegative(20));

    }
}