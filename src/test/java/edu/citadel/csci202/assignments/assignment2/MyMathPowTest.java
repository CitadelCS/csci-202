package edu.citadel.csci202.assignments.assignment2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyMathPowTest {

    private static MyMath myMath;

    @BeforeAll
    static void initialize() {
        myMath = new MyMath();
    }

    @Test
    void testMyPow_NegativeNumbers() {
        Assertions.assertEquals(-0.00411522633744856, myMath.myPow(-3, -5));
    }

    @Test
    void testMyPow_Zero() {
        Assertions.assertEquals(1.0, myMath.myPow(0, 0));
    }

    @Test
    void testMyPow_PositiveNumbers() {
        Assertions.assertEquals(2.32218265089212416E17, myMath.myPow(28, 12));
    }

    @Test
    void testMyPow_PositiveAndNegativeNumbers() {
        Assertions.assertEquals(1.0E20, myMath.myPow(-10, 20));
    }

    @Test
    void testMyPow_PositiveBigNumbers() {
        Assertions.assertEquals(1.6002560153604097E21, myMath.myPow(200008, 4));
    }
}
