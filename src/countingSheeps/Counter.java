package countingSheeps;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class Counter {
    public static int countSheep(Boolean[] arrayOfSheep) {
        long sheepPresent = Arrays.stream(arrayOfSheep)
                .filter(Objects::nonNull)
                .filter(status -> status )
                .count();
        return Integer.parseInt(Long.toString(sheepPresent));
    }

    public static void main(String[] args) {
        System.out.println(countSheep(new Boolean[]{true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true }));
        System.out.println(countSheep(new Boolean[]{null, null }));
    }
}
