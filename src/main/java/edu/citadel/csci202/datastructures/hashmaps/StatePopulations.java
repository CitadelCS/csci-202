package edu.citadel.csci202.datastructures.hashmaps;

import java.util.HashMap;

public class StatePopulations {

    public static void main (String[] args) {
        HashMap<String, Integer> statePopulation = new HashMap();

        // 2013 population data from census.gov
        statePopulation.put("CA", 38332521);
        statePopulation.put("AZ", 6626624);
        statePopulation.put("MA", 6692824);

        System.out.print("Population of Arizona in 2013 is ");
        System.out.print(statePopulation.get("AZ"));
        System.out.println(".");

        // 2014 estimated population
        statePopulation.put("AZ", 6871809);

        System.out.print("Population of Arizona in 2014 is ");
        System.out.print(statePopulation.get("AZ"));
        System.out.println(".");
    }
}
