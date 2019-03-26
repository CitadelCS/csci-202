package edu.citadel.csci202.recursion.ex1;

public class RecursiveDesign {

    public static void rprint(int count){
        if (count == 0)
            return;
        else{
            for(int i = 1; i <= count; i++){
                System.out.print("* ");
            }
            System.out.println();
            rprint(--count);
        }
    }

    public static void main(String[] args) {
        rprint(15);

    }

}