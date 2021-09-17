package exercise06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution06Test {
    @Test
    void calcTimeLeft() {
        Solution06 app = new Solution06();

        double expected = 1;
        double actual = app.calcTimeLeft(1, 2);

        assertEquals(expected, actual, 0.0001);
    }
}