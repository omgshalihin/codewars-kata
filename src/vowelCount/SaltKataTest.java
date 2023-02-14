package vowelCount;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SaltKataTest {


    @Test
    void getResultTor() {
        assertEquals("tor", SaltKata.getWord("towel", "car").get(0));
    }
    @Test
    void getResultCawel() {
        assertEquals("cawel", SaltKata.getWord("towel", "car").get(1));
    }

    @Test
    void getResultAlon() {
        assertEquals("alon", SaltKata.getWord("apple", "melon").get(0));
    }
    @Test
    void getResultMepple() {
        assertEquals("mepple", SaltKata.getWord("apple", "melon").get(1));
    }

    @Test
    void getResultBlate() {
        assertEquals("blate", SaltKata.getWord("black", "white").get(0));
    }
    @Test
    void getResultWhick() {
        assertEquals("whick", SaltKata.getWord("black", "white").get(1));
    }

    @Test
    void getResultMms() {
        assertEquals("mms", SaltKata.getWord("mms", "sms").get(0));
    }
    @Test
    void getResultSms() {
        assertEquals("sms", SaltKata.getWord("mms", "sms").get(1));
    }
}