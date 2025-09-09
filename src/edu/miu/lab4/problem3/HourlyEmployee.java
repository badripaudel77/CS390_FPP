package edu.miu.lab4.problem3;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(double wage, double hours) {
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double getPayment() {
        return this.wage * this.hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "[ State of HourlyEmployee Instance => Total Hours : " + this.getHours() +
                " Total Wage : " + this.getWage() +
                "]\n";
    }
}
