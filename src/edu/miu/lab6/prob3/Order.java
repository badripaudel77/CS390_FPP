package edu.miu.lab6.prob3;

import java.util.Objects;

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
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // g) Override equals() in Order.java (consistent equals implementation required).
    @Override
    public boolean equals(Object o) {
        // implement: same orderId => equal
        if (this == o) return true;
        if(o==null) return false;
        if (!(o instanceof Order order)) return false;

        return  Objects.equals(orderId, order.orderId);
    }

    @Override
    public int hashCode() {
        // consistent with equals
        int hashCode = this.orderId.hashCode();
        // System.out.println("hash " + hashCode);
        return hashCode;
    }

    @Override
    public String toString() {
        return "Order{" + orderId + ", " + customerName + ", " + totalAmount + "}";
    }
}
