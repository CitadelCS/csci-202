package edu.citadel.csci201.strings;

import java.util.Scanner;

public class StringsReview {

    public static void main(String[] args) {
        String message = "Welcome to Java";
        Scanner scan = new Scanner(System.in);

        System.out.println(message.charAt(0)); //first character
        System.out.println(message.length()); //length of the string
        System.out.println(message.concat(" Spring 2019 ")); //Join two strings -- also use + instead of concat
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        System.out.println("-------------------");
        System.out.println(message);

        System.out.println("-------------------");

        System.out.println("Enter a sentence: ");
        String sent = scan.nextLine();

        System.out.println(sent.startsWith("h"));
        System.out.println(sent.endsWith("h"));
        System.out.println(sent.contains("Java"));

        System.out.println(sent.substring(5));
        System.out.println(sent.substring(0, 5));

        String cityA = "Atlanta";
        String cityB = "New York";
        String cityC = "Atlanta";

        System.out.println(cityA.equals(cityB));
        System.out.println(cityA.equals(cityC));
        System.out.println(cityA.compareTo(cityB));

        System.out.println(cityA.indexOf('t'));

        String[] words = sent.split(" ");
        for (String w : words) {
            System.out.println(w);
        }

        String[] tokens = "Java#HTML#Perl".split("#");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");


        char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
        message = new String(charArray);
        System.out.println(message);

        System.out.println("Welcome".replace('e', 'A')); // returns a new string, WAlcomA.
        System.out.println("Welcome".replaceFirst("e", "AB")); //returns a new string, WABlcome.
        System.out.println("Welcome".replace("e", "AB")); //returns a new string, WABlcomAB.
        System.out.println("Welcome".replace("el", "AB")); //returns a new string, WABcome.

        int num1 = Integer.parseInt("123");
        double num2 = Double.parseDouble("23.45");

        System.out.println(num1 + " and " + num2);


        scan.close();


    }

}
