package exercise13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution13Test {

    @Test
    void calcInterest() {
        Solution13 app = new Solution13();

        double expected = 1938.84;
        double actual = app.calcInterest(1500, 4.3, 6, 4);

        assertEquals(expected, actual, 0.0001);
    }

}