package edu.citadel.csci202.interfaces.abstracts;


public class Dog extends Animal{

    String name;

    Dog(){
        super();
        name = "None";
    }

    Dog(String s, int a, String n){
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

    @Override
    public String eats() {
        return "Dog food";
    }

}
