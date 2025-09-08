package edu.miu.lab4.problem1;

public class Furniture extends Product {
    private final String material;
    private final double shippingCost;

    public Furniture(String material, double shippingCost) {
        this.material = material;
        this.shippingCost = shippingCost;
    }

    public String getMaterial() {
        return material;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.shippingCost;
    }

    @Override
    public String toString() {
        return "[ State of Furniture Instance => Material : " + this.material +
                " shipping cost : " + this.shippingCost +
                "]\n";
    }
}
