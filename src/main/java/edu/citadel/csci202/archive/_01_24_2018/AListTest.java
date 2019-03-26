package edu.citadel.csci202.archive._01_24_2018;

import java.util.ArrayList;

public class AListTest {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(40);
        numList.add(50);

        System.out.println(numList);

        for(int i = 0; i < numList.size(); i++){
            numList.set(i, numList.get(i) + 10);
        }

        System.out.println(numList);
        numList.remove(1);
        System.out.println(numList);

    }

}