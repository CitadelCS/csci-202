package edu.citadel.csci202.recursion.ex1;

public class RecursiveCalls {

    public static void backwardsAlphabet(char currLetter) {
        if (currLetter == 'a') {
            System.out.println(currLetter);
        }
        else {
            System.out.print(currLetter + " ");
            backwardsAlphabet(--currLetter);
        }
    }

    public static void main (String [] args) {
        char startingLetter = '-';

        startingLetter = 'z';

        backwardsAlphabet(startingLetter);

    }
}