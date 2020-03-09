package edu.citadel.csci202.files;

import java.io.File;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {

    public static void main(String[] args) throws Exception {
        File file = new File("src/main/java/edu/citadel/csci202/files/scores-write.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (
                // Create a file
                PrintWriter output = new PrintWriter(file)
        ) {
            // Write formatted output to the file
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }

}