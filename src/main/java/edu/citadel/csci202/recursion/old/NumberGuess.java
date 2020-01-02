package edu.citadel.csci202.recursion.old;

import java.util.Scanner;

public class NumberGuess {

    public static void guessNumber(int low, int high) {
        Scanner scanner = new Scanner(System.in);
        int mid; // Midpoint of low..high
        char answer;

        mid = (high + low) / 2;

        System.out.print("Is it " + mid + "? (l/h/y): ");
        answer = scanner.next().charAt(0);

        if ((answer != 'l') &&
                (answer != 'h')) {                // Base case:
            System.out.println("Thank you!"); // Found number!
        }
        else { // Recursive case: Guess in
            // lower or upper half of range
            if (answer == 'l') {  // Guess in lower half
                guessNumber(low, mid);    // Recursive call
            }
            else {                // Guess in upper half
                guessNumber(mid + 1, high); // Recursive call
            }
        }

    }

    public static void main (String[] args) {
        System.out.println("Choose a number from 0 to 100.");
        System.out.println("Answer with:");
        System.out.println("   l (your num is lower)");
        System.out.println("   h (your num is higher)");
        System.out.println("   any other key (guess is right).");

        guessNumber(0, 100);

    }
}