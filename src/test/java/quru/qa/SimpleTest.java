package quru.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {

    @Test
    void assertTrueTest() {
        assertTrue(true);
    }

    void assertFalseTest() {
        assertFalse(false);
    }
}
