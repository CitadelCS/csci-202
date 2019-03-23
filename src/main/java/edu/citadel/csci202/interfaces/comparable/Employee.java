package edu.citadel.csci202.interfaces.comparable;

import java.time.*;

public abstract class Employee implements Comparable<Employee> {

    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public abstract double getMonthlyPay() ;

    @Override
    public String toString() {
        return "[name=" + this.getName() + ", hireDate=" + this.getHireDate();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hireDate == null) ? 0 : hireDate.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        Employee other = (Employee) obj;
        if (hireDate == null) {
            if (other.hireDate != null)
                return false;
        } else if (!hireDate.equals(other.hireDate))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Employee emp){
        if(this.getMonthlyPay() > emp.getMonthlyPay())
            return 1;
        else if(this.getMonthlyPay() < emp.getMonthlyPay())
            return -1;
        else
            return 0;
    }

}
