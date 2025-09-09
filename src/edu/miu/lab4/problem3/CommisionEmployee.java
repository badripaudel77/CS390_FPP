package edu.miu.lab4.problem3;

public class CommisionEmployee extends Employee {
    private double grossSales;
    private double commisionRate; // percentage

    public CommisionEmployee() {

    }

    public CommisionEmployee(double grossSales, double commisionRate) {
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    @Override
    public double getPayment() {
        return this.grossSales * ( this.commisionRate / 100);
    }


    @Override
    public String toString() {
        return "[ State of CommisionEmployee Instance => Gross Sales : " + this.grossSales +
                " Commision Rate : " + this.commisionRate  + "%, Payment : " + this.getPayment() + "]\n";
    }
}
