package edu.miu.lab4.problem1;

public class Clothing extends Product {

    private final String brand;
    private final int discount;

    public Clothing(String brand, int discount) {
        this.brand = brand;
        this.discount = discount;
    }

    public String getBrand() {
        return brand;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() - (super.getPrice() * this.discount / 100);
    }

    @Override
    public String toString() {
        return "[ State of Clothing Instance => Cloth Branch : " + this.getBrand() +
                " Discount : " + this.getDiscount() +
                "]\n";
    }
}
