package edu.miu.lab4.problem1;

/** Lab4 assignment, Problem 1
 * Problem 1 : Problem 1: Product Pricing System
 * <br>
 * <p> Members: Badri Paudel & Nguyen Khanh Tran </p>
 */

public class TestClass {
    public static void main(String[] args) {

        Clothing clothing1 = new Clothing("Gucci", 5, 1000);
        Clothing clothing2 = new Clothing("Adidas", 3, 2500);

        Electronics electronics1 = new Electronics(12, 100.50, 1000);
        Electronics electronics2 = new Electronics(6, 50.66, 2000);

        Furniture furniture1 = new Furniture(MaterialType.WOOD, 50.45, 1000);
        Furniture furniture2 = new Furniture(MaterialType.STEEL, 30.50, 2000);

        Product[] products = { clothing1, clothing2, electronics1, electronics2, furniture1, furniture2 , null};
        double sumProducts = sumProducts(products);
        System.out.println("The total sum of the products : " + String.format("%.2f",sumProducts));
    }

    public static double sumProducts(Product[] col) {
        double sum = 0.0;
        if(col == null) {
            return sum;
        }
        for(Product product : col) {
            if(product == null) {
                //Skip null obj
                continue;
            }
            sum += product.getPrice();
            // print the status of the object
            System.out.println(product);
        }
        return sum;
    }
}
