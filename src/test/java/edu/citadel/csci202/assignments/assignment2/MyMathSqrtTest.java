package edu.citadel.csci202.assignments.assignment2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;

class MyMathSqrtTest {

    private static MyMath myMath;

    @BeforeAll
    static void initialize() {
        myMath = new MyMath();
    }

    @Test
    void testMySqrt_NegativeNumbers() {
        Assertions.assertEquals(NaN, myMath.mySqrt(-3));
    }

    @Test
    void testMySqrt_Zero() {
        Assertions.assertEquals(0, myMath.mySqrt(0));
    }

    @Test
    void testMySqrt_PositiveNumbers() {
        Assertions.assertEquals(5.291502622129181, myMath.mySqrt(28));
    }

    @Test
    void testMySqrt_PositiveNumbers_NoRemainder() {
        Assertions.assertEquals(4, myMath.mySqrt(16));
    }

    @Test
    void testMySqrt_Double() {
        Assertions.assertEquals(6.758357788693937, myMath.mySqrt(45.6754));
    }

    @Test
    void testMySqrt_PositiveBigNumbers() {
        Assertions.assertEquals(35304.29809527446, myMath.mySqrt( 1246393464));
    }
}
