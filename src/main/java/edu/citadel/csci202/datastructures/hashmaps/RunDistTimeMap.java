package edu.citadel.csci202.datastructures.hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class RunDistTimeMap {

    public static void main (String[] args) {
        HashMap<Integer, Double> raceTimes = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int userDistKm;

        raceTimes.put(5, 23.14);
        raceTimes.put(15, 78.5);
        raceTimes.put(25, 120.75);

        System.out.println("Enter race distance in km (0 to exit): ");
        userDistKm = scanner.nextInt();

        while(userDistKm != 0) {
            if(raceTimes.containsKey(userDistKm)){
                System.out.print("Best time for " + userDistKm + " km race is: ");
                System.out.print(raceTimes.get(userDistKm));
                System.out.println(" minutes.");
            }
            else{
                System.out.println("No race of the specified distance exists");
            }
            System.out.println();

            System.out.println("Enter race distance in km (0 to exit): ");
            userDistKm = scanner.nextInt();
        }
    }
}