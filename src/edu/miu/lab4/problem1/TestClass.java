package edu.miu.lab4.problem1;

/** Lab4 assignment, Problem 1
 * Problem 1 : Problem 1: Product Pricing System
 * <br>
 * <p> Members: Badri Paudel & Nguyen Khanh Tran </p>
 */

public class TestClass {
    public static void main(String[] args) {

        Clothing clothing1 = new Clothing("Guchi", 5);
        Clothing clothing2 = new Clothing("Adidas", 3);

        Electronics electronics1 = new Electronics(12, 100.50);
        Electronics electronics2 = new Electronics(6, 50.66);

        Furniture furniture1 = new Furniture("Wood", 50.45);
        Furniture furniture2 = new Furniture("Steel", 30.50);

        Product[] products = { clothing1, clothing2, electronics1, electronics2, furniture1, furniture2 };
        double sumProducts = sumProducts(products);
        System.out.println("The total sum of the products : " + String.format("%.2f",sumProducts));
    }

    public static double sumProducts(Product[] col) {
        double sum = 0.0;
        if(col == null || col.length == 0) {
            throw new NullPointerException("Product can't be empty / null.");
        }
        for(Product product : col) {
            if(product == null) {
                throw new NullPointerException("Product can't be null.");
            }
            sum += product.getPrice();
            // print the status of the object
            System.out.println(product);
        }
        return sum;
    }
}
