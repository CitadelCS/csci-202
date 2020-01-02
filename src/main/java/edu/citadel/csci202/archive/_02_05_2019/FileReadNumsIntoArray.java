package edu.citadel.csci202.archive._02_05_2019;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReadNumsIntoArray {

    public static void main(String[] args) throws IOException {
        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;                   // Scanner object
        ArrayList<Integer> numbers = new ArrayList<>();
        int i = 0;                             // Loop index

        // Try to open file
        fileByteStream = new FileInputStream("numbers.txt");
        File inf = new File("numbers.txt");
        //     inFS = new Scanner(fileByteStream);
        inFS = new Scanner(inf);

        // File is open and valid if we got this far (otherwise exception thrown)
        // Can use inFS stream via the Scanner object


        while (inFS.hasNext()) {
            numbers.add(inFS.nextInt());

        }

        // Done with file, so try to close it
        fileByteStream.close(); // close() may throw IOException if fails

        // Print numbers
        System.out.print("Numbers: ");

        i = 0;
        while (i < numbers.size()) {
            System.out.print(numbers.get(i) + " ");
            ++i;
        }

        System.out.println();

        inFS.close();

        //return;
    }
}