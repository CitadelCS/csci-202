package edu.citadel.csci202.abstracts;

import java.util.ArrayList;

public class AnimalTester {

    public static void main(String[] args) {

        ArrayList<Animal> alist = new ArrayList<>();

        //Create objects
        //Animal a1 = new Animal("Dolphin", 24);

        Dog d1 = new Dog("Lycaon pictus", 3, "Sprinkles");

        Fish f1 = new Fish("Shark", 23, "Folly Beach");

        //Add objects to ArrayList
        //alist.add(a1);
        alist.add(d1);
        alist.add(f1);

        //Traverse through the list and display information
        for (Animal a : alist) {
            System.out.println(a.getSpecies());
            System.out.println(a.getAge());
            System.out.println(a.eats());

            if (a instanceof Dog) {
                Dog d = (Dog) a;
                System.out.println("The Dog's name is: " + d.getName());
            }
            if (a instanceof Fish) {
                Fish f = (Fish) a;
                System.out.println("The Fish's location is: " + f.getLocation());
            }

            System.out.println("\n");

        }

    }

}