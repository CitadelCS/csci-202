package edu.citadel.csci202.assignments.assignment2;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("MyMath Tests")
@SelectClasses({MyMathSumTest.class,
                MyMathProductTest.class,
                MyMathSqrtTest.class,
                MyMathSubtractTest.class,
                MyMathPowTest.class,
                MyMathAreaOfRectangleTest.class})
class MyMathTestSuite {}
