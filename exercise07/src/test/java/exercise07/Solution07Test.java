package exercise07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution07Test {

    @Test
    void calcRoomArea() {
        Solution07 app = new Solution07();

        double expected = 25;
        double actual = app.calcRoomArea(5, 5);

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void convertMetric() {
        Solution07 app = new Solution07();

        double expected = 0.3048;
        double actual = app.convertMetric(1);

        assertEquals(expected, actual, 0.0001);
    }
}