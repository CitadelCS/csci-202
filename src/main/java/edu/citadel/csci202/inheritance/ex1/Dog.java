package edu.citadel.csci202.inheritance.ex1;

public class Dog extends Animal {

    String name;

    public Dog() {
        super();
        name = "None";
    }

    public Dog(String s, int a, String n) {
        super(s, a);
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return super.toString() + "\n Name: " + this.getName();
    }

}