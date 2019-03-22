package edu.citadel.csci202.inheritance.ex2;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    double wageRate;

    double hoursWorked;

    public HourlyEmployee(String name, LocalDate hireDate, double wageRate, double hoursWorked) {
        super(name, hireDate);
        this.wageRate = wageRate;
        this.hoursWorked = hoursWorked;
    }

    public double getWageRate() {
        return wageRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getMonthlyPay() {
        return wageRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "HourlyEmployee" + super.toString() + ", wageRate=" + this.wageRate + ", hoursWorked=" + this.hoursWorked + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(hoursWorked);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(wageRate);
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
        HourlyEmployee other = (HourlyEmployee) obj;
        if (Double.doubleToLongBits(hoursWorked) != Double.doubleToLongBits(other.hoursWorked))
            return false;
        return Double.doubleToLongBits(wageRate) == Double.doubleToLongBits(other.wageRate);
    }

}