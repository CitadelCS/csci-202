package edu.citadel.csci202.equals;

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

    public boolean equals(Object o) {
        if (o instanceof Dog) {
            Dog d = (Dog) o;
            return this.getAge() == d.getAge() &&
                    this.getSpecies().equals(d.getSpecies()) &&
                    this.getName().equals(d.getName());
        }
        return false;
    }

}