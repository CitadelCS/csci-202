package edu.citadel.csci202.inheritance.ex1;

import java.util.ArrayList;

public class AnimalTester {

    public static void main(String[] args) {
        ArrayList<Animal> alist = new ArrayList<>();

        Dog d1 = new Dog("Lycaon pictus", 3, "Sprinkles");


        alist.add(d1);

        for (Animal a : alist) {
            System.out.println(a.toString() + "\n");
        }

    }

}
