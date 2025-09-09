package edu.miu.lab4.problem1;

public class Electronics extends Product {
    private final int warrantyInMonths;
    private final double warrantyCost;

    public Electronics(int warrantyInMonths, double warrantyCost, double price) {
        this.warrantyInMonths = warrantyInMonths;
        this.warrantyCost = warrantyCost;
        super.setPrice(price);
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
                ", Pre-warranty price : " + super.getPrice() +
                 ", warranty cost : " + this.getWarrantyCost() +
                ", Price: " + this.getPrice() +
                "]\n";
    }
}
