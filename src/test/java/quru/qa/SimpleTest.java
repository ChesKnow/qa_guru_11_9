package quru.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {

    @Test
    void assertTrueTest() {
        assertTrue(3 > 0);
    }

    void assertFalseTest() {
        assertFalse(false);
    }

    @Test
    void assertFailAnotherTest() {
        fail("another fail");
    }

    @Test
    void assertFailTest() {
        fail();
    }
}
