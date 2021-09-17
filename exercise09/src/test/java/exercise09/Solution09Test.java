package exercise09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution09Test {

    @Test
    void calcGallonCount1() {
        Solution09 app = new Solution09();

        double expected = 1;
        double actual = app.calcGallonCount(350);

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void calcGallonCount2() {
        Solution09 app = new Solution09();

        double expected = 2;
        double actual = app.calcGallonCount(351);

        assertEquals(expected, actual, 0.0001);
    }
}