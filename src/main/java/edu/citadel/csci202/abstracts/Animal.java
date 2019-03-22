package edu.citadel.csci202.abstracts;

public abstract class Animal {
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
        return "Species: " + this.getSpecies() + "\nAge: " + this.getAge();
    }

    public abstract String eats();
}