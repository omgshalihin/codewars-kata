package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void test() {
        assertEquals(3, Money.calculateYears(1000,0.05,0.18,1100));
        assertEquals(14 , Money.calculateYears(1000,0.01625,0.18,1200));
        assertEquals(0, Money.calculateYears(1000,0.05,0.18,1000));
    }

}