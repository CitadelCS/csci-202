package edu.citadel.csci202.assignments.assignment2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyMathSubtractTest {

    private static MyMath myMath;

    @BeforeAll
    static void initialize() {
        myMath = new MyMath();
    }

    @Test
    void testMySubtract_NegativeNumbers() {
        Assertions.assertEquals(2, myMath.subtract(-3, -5));
    }

    @Test
    void testMySubtract_Zero() {
        Assertions.assertEquals(0, myMath.subtract(0, 0));
    }

    @Test
    void testMySubtract_PositiveNumbers() {
        Assertions.assertEquals(16, myMath.subtract(28, 12));
    }

    @Test
    void testMySubtract_PositiveAndNegativeNumbers() {
        Assertions.assertEquals(-30, myMath.subtract(-10, 20));
    }

    @Test
    void testMySubtract_PositiveBigNumbers() {
        Assertions.assertEquals(-1246193456, myMath.subtract(200008, 1246393464));
    }
}
