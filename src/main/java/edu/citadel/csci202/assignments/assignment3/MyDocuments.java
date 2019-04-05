package edu.citadel.csci202.assignments.assignment3;

public class MyDocuments {

    public static void main(String[] args) {
        // Finish implementing the main method to test your Document objects
        // Call containsKeyword from this method
    }

    /**
     * Use this method to test your Documents for the specified keyword
     * @param document the Document object to be tested
     * @param keyword the String text to be found
     * @return true if the keyword is found in the text field. false otherwise.
     */
    public static boolean containsKeyword(Document document, String keyword) {
        return document.toString().contains(keyword);
    }
}
