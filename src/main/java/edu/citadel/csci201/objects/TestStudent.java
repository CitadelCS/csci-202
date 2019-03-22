package edu.citadel.csci201.objects;

public class TestStudent {

    public static void main(String[] args) {
        //Add code to create student objects - use both versions of constructors

        Student s1 = new Student();

        Student s2 = new Student("Joe", 1);

        Student s3 = new Student("Jack", 2, "j@cit.edu", 3.5);

        //Print student information using toString method

        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println("GPA = " + s2.getGpa());
        s2.setGpa(3.45);
        System.out.println("GPA = " + s2.getGpa());
        System.out.println(s3);

    }

}
