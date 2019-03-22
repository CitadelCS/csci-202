package edu.citadel.csci202.inheritance.ex1;

public class Animal {
    String species;
    int age;

    public Animal() {
        species = "None";
        age = 0;
    }

    public Animal(String s, int a) {
        species = s;
        age = a;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Species: " + this.getSpecies() + "\n Age: " + this.getAge();
    }


}