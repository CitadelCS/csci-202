package edu.citadel.csci202.abstracts;

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
        // TODO Auto-generated method stub
        return "fish food";
    }


}