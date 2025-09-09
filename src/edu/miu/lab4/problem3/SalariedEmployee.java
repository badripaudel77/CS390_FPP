package edu.miu.lab4.problem3;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(double weeklySalary) {
        this.weeklySalary = weeklySalary;

    }

    @Override
    public double getPayment() {
        return this.weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "[ State of SalariedEmployee Instance => Total Weekly Salary : " + getWeeklySalary() + "" +
                " Payment: " + getPayment() +
                "]\n";
    }
}
