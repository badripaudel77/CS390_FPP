package edu.miu.lab4.problem1;

public class Electronics extends Product {
    private final int warrantyInMonths;
    private final double warrantyCost;

    public Electronics(int warrantyInMonths, double warrantyCost) {
        this.warrantyInMonths = warrantyInMonths;
        this.warrantyCost = warrantyCost;
    }

    public int getWarrantyInMonths() {
        return warrantyInMonths;
    }

    public double getWarrantyCost() {
        return warrantyCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.getWarrantyCost();
    }

    @Override
    public String toString() {
        return "[ State of Electronics Instance => Warranty in months : " + this.getWarrantyInMonths() +
                 " warranty cost : " + this.getWarrantyCost() +
                "]\n";
    }
}
