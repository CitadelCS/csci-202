package edu.citadel.csci202.interfaces.abstracts;

import java.util.ArrayList;

public class AnimalTester {

    public static void main(String[] args) {

        ArrayList<Animal> alist = new ArrayList<>();

        Dog d1 = new Dog("Lycaon pictus", 3, "Sprinkles");

        Fish f1 = new Fish("Tursiops truncatus", 30, "South Carolina Coast");

        alist.add(d1);
        alist.add(f1);

        for(Animal a: alist) {
            System.out.println(a.toString() );
            System.out.println("Eats: "+ a.eats());
            if (a instanceof Edible){
                Edible e = (Edible)a;
                System.out.println("How to eat: "+ e.howToEat());
            }
            System.out.println("----------------------------");
        }

    }

}
