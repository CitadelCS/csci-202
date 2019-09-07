package edu.citadel.csci202.assignments.assignment2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyMathAreaOfRectangleTest {

    private static MyMath myMath;

    @BeforeAll
    static void initialize() {
        myMath = new MyMath();
    }

    @Test
    void testAreaOfRectangle_NegativeNumbers() {
        Assertions.assertEquals(15, myMath.calcAreaOfRectangle(-3, -5));
    }

    @Test
    void testAreaOfRectangle_Zero() {
        Assertions.assertEquals(0, myMath.calcAreaOfRectangle(0, 0));
    }

    @Test
    void testAreaOfRectangle_PositiveNumbers() {
        Assertions.assertEquals(336, myMath.calcAreaOfRectangle(28, 12));
    }

    @Test
    void testAreaOfRectangle_PositiveAndNegativeNumbers() {
        Assertions.assertEquals(-200, myMath.calcAreaOfRectangle(-10, 20));
    }

    @Test
    void testAreaOfRectangle_PositiveBigNumbers() {
        Assertions.assertEquals(249288663947712L, myMath.calcAreaOfRectangle(200008, 1246393464));
    }
}
