package edu.citadel.csci202.exceptions.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuotientWithException {

    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int number1 = 0, number2 = 0;
        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        try {
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is "
                    + result);
        } catch (InputMismatchException ex) {
            System.out.println("Please enter whole numbers only! ");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("An exception has occurred! ");
        }

        System.out.println("Execution continues ...");
    }

}