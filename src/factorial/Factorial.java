package factorial;

import java.util.stream.IntStream;

public class Factorial {

    public static int factorial(int n) {

        if (n < 0 || n > 12){
            throw new IllegalArgumentException("");
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(15));
    }
}
