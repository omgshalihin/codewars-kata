package diffVolCubes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CuboidVolumes {
    public static int findDifferences(final int[] firstCuboid, final int[] secondCuboid) {
        int a = IntStream.of(firstCuboid).reduce(1,(acc, curr) -> acc * curr);
        int b = IntStream.of(secondCuboid).reduce(1, (acc, curr) -> acc * curr);
        return Math.abs(a-b);
    }
}
