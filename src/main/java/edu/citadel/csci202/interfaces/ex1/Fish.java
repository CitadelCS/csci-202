package edu.citadel.csci202.interfaces.ex1;

public class Fish extends Animal {
    String location;

    public Fish() {
        super();
        this.location = "None";
    }

    public Fish(String s, int a, String l) {
        super(s, a);
        this.location = l;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return super.toString() + "\nlocation= " + location;
    }

    @Override
    public String eats() {
        return "fish food";
    }


}