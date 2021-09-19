package exercise11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution11Test {

    @Test
    void convertToDollar() {
        Solution11 app = new Solution11();

        double expected = 111.39;
        double actual = app.convertToDollar(81, 1.3751);

        assertEquals(expected, actual, 0.0001);
    }

}