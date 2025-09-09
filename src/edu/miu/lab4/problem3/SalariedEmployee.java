package edu.miu.lab4.problem3;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(double weeklySalary) {
        this.weeklySalary = weeklySalary;

    }

    @Override
    public double getPayment() {
        return 0;
    }

    public double getBaseSalary() {
        return weeklySalary;
    }

    public void setBaseSalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "[ State of SalariedEmployee Instance => Total Weekly Salary : " + this.weeklySalary + "]\n";
    }
}
