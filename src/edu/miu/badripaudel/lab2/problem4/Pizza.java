package edu.miu.badripaudel.lab2.problem4;


public class Pizza {
    private final PizzaSize size;
    private final PizzaType type;
    private final int quantity;

    public Pizza(PizzaSize size, PizzaType type, int quantity) {
        this.size = size;
        this.type = type;
        this.quantity = quantity;
    }

    private double calculatePrice() {
        double totalPrice = 0.0;
        double priceBasedOnSize = switch (size) {
            case PizzaSize.SMALL -> 8;
            case PizzaSize.MEDIUM -> 10;
            case PizzaSize.LARGE -> 12;
        };

        double priceBasedOnType = switch (type) {
            case PizzaType.VEGGIE -> 1;
            case PizzaType.PEPPERONI, PizzaType.BBQCHICKEN -> 2;
            case PizzaType.CHEEZE -> 1.5;
        };
        totalPrice = (priceBasedOnSize + priceBasedOnType) * this.quantity;
        return totalPrice;
    }

    public String printOrderSummary() {
        double withoutTaxPrice = calculatePrice();
        double tax = withoutTaxPrice * 3 / 100;
        double totalPrice = withoutTaxPrice + tax;
        return String.format("""
                Pizza Order: 
                Size : %s
                Type: %s
                Qty: %d
                Price: %.2f
                Tax: %.2f,
                Total Price: %.2f
                """, size, type, quantity, withoutTaxPrice, tax, totalPrice);
    }
}
