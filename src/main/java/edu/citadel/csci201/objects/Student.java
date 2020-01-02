package edu.citadel.csci201.objects;

/**
 * @author deepti joshi
 * Date: 1/22/2018
 */

public class Student {

    //Class attributes or instance variables -- these should be private
    private String name;
    private int id;
    private String email;
    private double gpa;

    //default constructor
    public Student() {
        this.name = "No name";
        this.id = 0;
        this.email = "no email";
        this.gpa = 0.0;
    }

    //parameterized constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.email = "no email";
        this.gpa = 0.0;
    }

    public Student(String name, int id, String email, double gpa) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.gpa = gpa;
    }

    //Getters or Accessors -- these should be public
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public double getGpa() {
        return gpa;
    }


    //Setters -- these should be public
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //other methods -- these should be public

    //toString method
    public String toString() {
        return "Id: " + this.getId() + " \nName: " + this.getName() + " \nEmail: " + this.getEmail();
    }

}