package edu.citadel.csci202.datastructures.stack;

import java.util.Stack;

public class UsingStacks {

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);

        for(Integer num: stack1) {
            System.out.println(num);
        }

        System.out.println();

        /*
         * for(int i = 0; i < stack1.size(); i++){
         * System.out.println(stack1.pop());
         * }
         */

        while(!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }

        Stack<String> s2 = new Stack<>();
        s2.push("The");
        s2.push("World");
        s2.push("Is");
        s2.push("Great");

        while(!s2.isEmpty()) {
            System.out.print(s2.pop() + " ");
        }

    }

}