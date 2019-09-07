package edu.citadel.csci202.assignments.assignment2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyMathProductTest {

    private static MyMath myMath;

    @BeforeAll
    static void initialize() {
        myMath = new MyMath();
    }

    @Test
    void testMyProduct_NegativeNumbers() {
        Assertions.assertEquals(15, myMath.myProduct(-3, -5));
    }

    @Test
    void testMyProduct_Zero() {
        Assertions.assertEquals(0, myMath.myProduct(0, 0));
    }

    @Test
    void testMyProduct_PositiveNumbers() {
        Assertions.assertEquals(336, myMath.myProduct(28, 12));
    }

    @Test
    void testMyProduct_PositiveAndNegativeNumbers() {
        Assertions.assertEquals(-200, myMath.myProduct(-10, 20));
    }

    @Test
    void testMyProduct_PositiveBigNumbers() {
        Assertions.assertEquals(249288663947712L, myMath.myProduct(200008, 1246393464));
    }
}
