package edu.citadel.csci202.recursion.old;

public class CalculatePennies {

    // Returns number of pennies if pennies are doubled numDays times
    public static long doublePennies(long numPennies, int numDays) {
        long totalPennies = 0;

        if (numDays < 1) {
            totalPennies = numPennies;
        }
        else {
            totalPennies = doublePennies((numPennies * 2), numDays - 1);
        }
        return totalPennies;
    }

    // Program computes pennies if you have 1 penny today,
    // 2 pennies after one day, 4 after two days, and so on
    public static void main(String[] args) {
        long startingPennies = 1;
        int userDays = 20;

        System.out.println("Number of pennies after " + userDays + " days: " + doublePennies(startingPennies, userDays));

    }
}