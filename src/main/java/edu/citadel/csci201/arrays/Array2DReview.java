package edu.citadel.csci201.arrays;

import java.util.Scanner;

public class Array2DReview {

    public static void main(String[] args) {

        int[][] uvals = new int[2][2];
        Scanner input = new Scanner(System.in);
        int totalSum = 0;
        int rSum = 0;
        int cSum = 0;

        System.out.println("Enter 4 whole numbers");

        for (int i = 0; i < uvals.length; i++) {
            for (int j = 0; j < uvals[0].length; j++) {
                uvals[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < uvals.length; i++) {
            rSum = 0;
            for (int j = 0; j < uvals[0].length; j++) {
                //System.out.print(uvals[i][j] + " ");
                totalSum += uvals[i][j];
                rSum += uvals[i][j];
            }
            System.out.println("Row " + i + " sum  = " + rSum);
        }

        System.out.println("Total Sum = " + totalSum);

        for (int j = 0; j < uvals[0].length; j++) {
            cSum = 0;
            for (int i = 0; i < uvals.length; i++) {
                cSum += uvals[i][j];
            }
            System.out.println("Col " + j + " sum  = " + cSum);
        }

    }

}
