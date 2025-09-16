package lesson8.prob4;

public class Order {
    private String orderId;
    private String customerName;
    private double totalAmount;

    public Order(String orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // getters/setters

    @Override
    public boolean equals(Object o) {
        // implement: same orderId => equal
        return false;
    }

    @Override
    public int hashCode() {
        // consistent with equals
        return 0;
    }

    @Override
    public String toString() {
        return "Order{" + orderId + ", " + customerName + ", " + totalAmount + "}";
    }
}
