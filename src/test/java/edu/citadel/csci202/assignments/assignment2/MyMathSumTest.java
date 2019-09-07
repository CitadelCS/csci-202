package edu.citadel.csci202.assignments.assignment2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyMathSumTest {

    private static MyMath myMath;

    @BeforeAll
    static void initialize() {
        myMath = new MyMath();
    }

    @Test
    void testMySum_NegativeNumbers() {
        Assertions.assertEquals(-8, myMath.mySum(-3, -5));
    }

    @Test
    void testMySum_Zero() {
        Assertions.assertEquals(0, myMath.mySum(0, 0));
    }

    @Test
    void testMySum_PositiveNumbers() {
        Assertions.assertEquals(40, myMath.mySum(28, 12));
    }

    @Test
    void testMySum_PositiveAndNegativeNumbers() {
        Assertions.assertEquals(10, myMath.mySum(-10, 20));
    }

    @Test
    void testMySum_PositiveBigNumbers() {
        Assertions.assertEquals(1246593472, myMath.mySum(200008, 1246393464));
    }
}
