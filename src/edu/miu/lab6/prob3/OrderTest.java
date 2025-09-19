package edu.miu.lab6.prob3;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {
        // a) through i) here, print after each step (use for-each)

        // a) Create an ArrayList<Order>.
        // b) add() at least five Order objects.
        List<Order> orders = new ArrayList<>();

        Order o1 = new Order("ORD001", "Bob", 540.00);
        Order o2 = new Order("ORD002", "Charlie", 125.50);
        Order o3 = new Order("ORD003", "Alice", 250.75);
        Order o4 = new Order("ORD004", "Diana", 300.00);
        Order o5 = new Order("ORD005", "Ethan", 450.25);
        Order o6 = new Order("ORD005", "Ethan", 450.25);

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        orders.add(o4);
        orders.add(o5);
        orders.add(o6);
        printList(orders, "Printing after adding five objects : ");

        //  Delete an object by instance (pass an Order you previously added).
        orders.remove(o3);
        printList(orders, "Printing after removing an object : ");

        // d) Print size of the list
        System.out.println("Size of the list : " + orders.size());

        // e) Retrieve an Order by position (get(index)) and print it.
        Order order = orders.get(2);
        System.out.println("Order at 2 index : " + order);
        System.out.println("---------------------------");


        // f) Update the details of an Order by position (set(index, new Order(...))).
        orders.set(1, new Order("ORD006", "Paudel", 200.50));
        printList(orders, "Printing after Updating the oder using set at position 1: ");

        // h) Sort by totalAmount (ascending) using a Comparator that’s consistent with equals. Print the sorted list.
        orders.sort(
                Comparator.nullsFirst(
                        Comparator.comparing(Order::getTotalAmount, Comparator.nullsFirst(Double::compare))
                                .thenComparing(Order::getCustomerName, Comparator.nullsFirst(String::compareTo))
                                .thenComparing(Order::getOrderId, Comparator.nullsFirst(String::compareTo))
                )
        );

        printList(orders, "Printing after sorting by total amount :");

        // i ) sort that result by customerName (A→Z)
        List<Order> orderList = listMoreThan50(orders);
        orderList.sort(
                Comparator.nullsFirst(
                        Comparator.comparing(Order::getCustomerName, Comparator.nullsFirst(String::compareTo))
                                .thenComparing(Order::getOrderId, Comparator.nullsFirst(String::compareTo))
                                    .thenComparing(Order::getTotalAmount,Comparator.nullsFirst(Double::compare))
                )
        );

        printList(orderList, "Printing after Sorting by customer name of returned result : ");

        // Check if two orders are equal
        Order firstOrder = new Order("ORD00901", "Bob", 540.00);
        Order secondOrder = new Order("ORD00901", "Bob", 540.00);
        System.out.println("Are given two orders equal ? : " + firstOrder.equals(secondOrder));
    }

    private static void printList(List<Order> orderList, String message) {
        System.out.println(message);
        for (Order o: orderList) {
            System.out.println(o);
        }
        System.out.println("---------------------------");
    }

    public static List<Order> listMoreThan50(List<Order> list) {
        // return new ArrayList<>(...) with totalAmount > 50.0
        List<Order> orderList = new ArrayList<>();
        for(Order order: list) {
            if(order != null && order.getTotalAmount() > 50.0) {
                orderList.add(order);
            }
        }
        return orderList;
    }
}
