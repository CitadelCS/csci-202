package edu.citadel.csci202.assignments.assignment5;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {

    // sample web page = https://en.wikipedia.org/wiki/Citadel

    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString);
            CharSequence cs = "<h1 id=\"firstHeading\" class=\"firstHeading\" lang=\"en\">";
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String line = input.nextLine();
                if(line.contains(cs)){
                    int start = line.indexOf('>');
                    int end = line.indexOf('<', start);
                    System.out.println(line.substring(start+1, end));


                    //System.out.println(line);
                }

            }


        }
        catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch (IOException ex) {
            System.out.println("IO Errors");
        }
    }

}