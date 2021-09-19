package exercise12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12Test {

    @Test
    void calcInterest() {
        Solution12 app = new Solution12();

        double expected = 1758;
        double actual = app.calcInterest(1500, 4.3, 4);

        assertEquals(expected, actual, 0.0001);
    }

}