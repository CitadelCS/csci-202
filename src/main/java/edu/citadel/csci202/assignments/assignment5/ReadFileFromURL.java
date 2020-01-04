package edu.citadel.csci202.assignments.assignment5;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.MalformedURLException;

public class ReadFileFromURL {

    public static void main(String[] args) {

        // Read the JSoup Cookbook to learn more about how to the library
        // https://jsoup.org/cookbook/

        try {
            String url = "https://en.wikipedia.org/wiki/Citadel";
            Document document = Jsoup.connect(url).get();

            // Get heading value
            String heading = document.getElementById("firstHeading").text();

            //TODO: Finish the program
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (IOException ex) {
            System.out.println("IO Errors");
        }
    }

}