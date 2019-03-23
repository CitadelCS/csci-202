package edu.citadel.csci202.interfaces.abstracts;

public class Fish extends Animal implements Edible, Locomotion{

    String location;

    Fish(){
        super();
        location = "None";
    }

    Fish(String s, int a, String l){
        super(s, a);
        location = l;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return super.toString() + "\n Location: " + this.getLocation();
    }

    @Override
    public String eats() {
        return "plankton";
    }

    @Override
    public String howToEat() {
        return "Fried";
    }

    @Override
    public String wiggle() {
        return "up-down";
    }

}
