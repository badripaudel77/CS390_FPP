package edu.miu.lab4.problem1;

public class Furniture extends Product {
    private final String material;
    private final double shippingCost;

    public Furniture(MaterialType material, double shippingCost, double price) {
        this.material = material.toString();
        this.shippingCost = shippingCost;
        super.setPrice(price);
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
                ", Price without shipping cost: " + super.getPrice() +
                ", shipping cost : " + this.shippingCost +
                ", Total cost : " + this.getPrice() +
                "]\n";
    }
}
