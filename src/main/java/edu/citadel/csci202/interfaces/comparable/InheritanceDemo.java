package edu.citadel.csci202.interfaces.comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class InheritanceDemo {

    public static void main(String[] args) {
        ArrayList<Employee> test = new ArrayList<>();

        HourlyEmployee john = new HourlyEmployee("John Doe", LocalDate.of(2009, 5, 21), 50.5, 160.0);
        HourlyEmployee jane = new HourlyEmployee("Jane Doe", LocalDate.of(2005, 9, 1), 150.5, 80.0);
        SalariedEmployee moe = new SalariedEmployee("Moe Howard", LocalDate.of(2004, 1, 1), 75000.0);
        SalariedEmployee curly = new SalariedEmployee("Curly Howard", LocalDate.of(2018, 1, 1), 105000.0);

        System.out.println("List of Employees");
        test.add(john);
        test.add(jane);
        test.add(moe);
        test.add(curly);

        for (Employee a : test) {
            System.out.println(a.toString());
        }

        System.out.println();
        System.out.println("Monthly Pay before sorting:");

        for (Employee a : test) {
            System.out.printf("%s: $%, .2f\n", a.getName(), a.getMonthlyPay());
        }

        System.out.println();
        System.out.println("Monthly Pay after sorting:");

        Collections.sort(test);

        for (Employee a : test) {
            System.out.printf("%s: $%, .2f\n", a.getName(), a.getMonthlyPay());
        }

    }
}