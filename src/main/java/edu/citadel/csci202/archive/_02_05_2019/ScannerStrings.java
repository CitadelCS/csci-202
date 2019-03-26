package edu.citadel.csci202.archive._02_05_2019;

import java.util.Scanner;

public class ScannerStrings {

    public static void main(String[] args) {
        String in = "Hello, today is Feb 5 2019";

        Scanner inS = new Scanner(in);
        while(inS.hasNext()) {
            System.out.println(inS.next());
        }

        inS.close();

    }

}