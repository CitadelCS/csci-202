package edu.citadel.csci202.inheritance.old;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {
        ArrayList<Student> sList = new ArrayList<Student>();

        sList.add(new Student("Joe", "Smith", "123-XXXX", "TH 224", "joe@cit"));
        sList.add(new Student("Jack", "Jones", "555-XXXX", "TH 228", "jack@cit"));

        for(Student s: sList){
            System.out.println(s.toString());
        }

    }

}