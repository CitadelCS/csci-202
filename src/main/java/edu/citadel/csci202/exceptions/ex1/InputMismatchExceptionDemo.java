package edu.citadel.csci202.exceptions.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();

                // Display the result
                System.out.println(
                        "The number entered is " + number);

                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required)");
                // System.out.println(ex.getMessage());
                input.nextLine(); // discard input
            }
        } while (continueInput);
    }

}