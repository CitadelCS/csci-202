package edu.citadel.csci202.inheritance.ex2;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double annualSalary;

    SalariedEmployee(String name, LocalDate hireDate, double annualSalary) {
        super(name, hireDate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getMonthlyPay() {
        return annualSalary / 12.0;
    }

    @Override
    public String toString() {
        return "SalariedEmployee" + super.toString() + ", annualSalary= " + this.getAnnualSalary() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(annualSalary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        SalariedEmployee other = (SalariedEmployee) obj;
        return Double.doubleToLongBits(annualSalary) == Double.doubleToLongBits(other.annualSalary);
    }

}