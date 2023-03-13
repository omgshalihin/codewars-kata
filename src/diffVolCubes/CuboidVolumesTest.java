package diffVolCubes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidVolumesTest {

    @Test
    public void sampleTestCases() {
        int[] firstCuboid0 = { 2,2,3 };
        int[] secondCuboid0 = { 5,4,1 };
        int[] firstCuboid1 = { 3,2,5 };
        int[] secondCuboid1 = { 1,4,4 };

        assertEquals(8, CuboidVolumes.findDifferences(firstCuboid0, secondCuboid0));
        assertEquals(14, CuboidVolumes.findDifferences(firstCuboid1, secondCuboid1));
    }
}