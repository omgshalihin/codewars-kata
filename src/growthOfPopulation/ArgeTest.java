package growthOfPopulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArgeTest {

    @Test
    void test() {
        assertEquals(Arge.nbYear(1000, 2, 50, 1200), 3);
        assertEquals(Arge.nbYear(1500, 5, 100, 5000), 15);
    }

}