package stringEndsWith;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void solutionTests() {
        assertTrue(Kata.solution("samurai", "ai"));
        assertTrue(Kata.solution("samurai", "i"));
        assertTrue(Kata.solution("abcabc", "bc"));
        assertFalse(Kata.solution("sumo", "omo"));

    }

}