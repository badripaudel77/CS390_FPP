package edu.miu.lab4.problem3;

public class BasePlusCommisionEmployee extends CommisionEmployee {
    private double baseSalary;

    public BasePlusCommisionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double getPayment() {
        return 0;
    }

    @Override
    public String toString() {
        return "[ State of BasePlusCommisionEmployee Instance => Base Salary : " + this.baseSalary + "]\n";
    }
}
