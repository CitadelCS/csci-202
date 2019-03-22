package edu.citadel.csci202.interfaces.ex1;

public class CatFish extends Fish implements Edible {

    @Override
    public String howToEat() {
        return "CatFish: Fry it";
    }

}