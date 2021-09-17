package exercise08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution08Test {

    @Test
    void calcSliceCount1() {
        Solution08 app = new Solution08();

        double expected = 25;
        double actual = app.calcSliceCount(5, 5,0);

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void calcSliceCount2() {
        Solution08 app = new Solution08();

        double expected = 1;
        double actual = app.calcSliceCount(5, 5,1);

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void calcSliceCount3() {
        Solution08 app = new Solution08();

        double expected = 1;
        double actual = app.calcSliceCount(5, 6,2);

        assertEquals(expected, actual, 0.0001);
    }
}