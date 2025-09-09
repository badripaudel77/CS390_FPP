package edu.miu.lab4.problem3;

public class BasePlusCommisionEmployee extends CommisionEmployee {
    private double baseSalary;

    public BasePlusCommisionEmployee(double baseSalary, double commisionRate, double grossSales) {
        this.baseSalary = baseSalary;
        super.setCommisionRate(commisionRate);
        super.setGrossSales(grossSales);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return this.baseSalary + (super.getGrossSales() * ( super.getCommisionRate() / 100));
    }

    @Override
    public String toString() {
        return "[ State of BasePlusCommisionEmployee Instance => " +
                ", BaseSalary = " + baseSalary +
                ", Gross sale =" + super.getGrossSales() +
                ", Commision Rate = " + super.getCommisionRate() + "%" +
                " Payment : " + this.getPayment() + "]\n";
    }
}
