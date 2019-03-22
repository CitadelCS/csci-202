package edu.citadel.csci201.selections;

import java.util.Scanner;

public class DogYearsMonths {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int dogAgeYears;
        int dogAgeMonths;

        System.out.print("Enter dog's age (in years): ");
        dogAgeYears = scnr.nextInt();

        if (dogAgeYears == 0) {
            System.out.print("Enter dog's age in months: ");
            dogAgeMonths = scnr.nextInt();

            switch (dogAgeMonths) {
                case 0:
                case 1:
                case 2:
                    System.out.println("That's 0..14 human months.");
                    break;

                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("That's 14 months to 5 human years.");
                    break;

                case 7:
                case 8:
                    System.out.println("That's 5..9 human years.");
                    break;

                case 9:
                case 10:
                case 11:
                case 12:
                    System.out.println("That's 9..15 human years.");
                    break;

                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } else {
            switch (dogAgeYears) {
                case 0:
                    System.out.println("That's 0..14 human years.");
                    break;

                case 1:
                    System.out.println("That's 15 human years.");
                    break;

                case 2:
                    System.out.println("That's 24 human years.");
                    break;

                case 3:
                    System.out.println("That's 28 human years.");
                    break;

                case 4:
                    System.out.println("That's 32 human years.");
                    break;

                case 5:
                    System.out.println("That's 37 human years.");
                    break;

                default:
                    System.out.println("Human years unknown.");
                    break;
            }
        }
    }

}
