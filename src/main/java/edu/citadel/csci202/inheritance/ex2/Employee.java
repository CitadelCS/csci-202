package edu.citadel.csci202.inheritance.ex2;

import java.time.LocalDate;

public class Employee {
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

    public double getMonthlyPay() {
        return 0.00;
    }

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
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (hireDate == null) {
            if (other.hireDate != null)
                return false;
        } else if (!hireDate.equals(other.hireDate))
            return false;
        if (name == null) {
            return other.name == null;
        } else return name.equals(other.name);
    }

}