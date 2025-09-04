package edu.miu.badripaudel.lab2.problem4;
/**
 * @author Badri Paudel
 * @since 9/4/2025
 * <p>This is the assignment for lab 2, FPP course, MIU, IA</p>
 * Program name: <b>“Problem 4: Pizza Order Management with Enums & Switch Expressions”</b>
 * <p> Members: Badri Paudel & Nguyen Khanh Tran </p>
 */
public class PizzaTest {
    public static void main(String[] args) {
            Pizza pizza1 = new Pizza(PizzaSize.SMALL, PizzaType.VEGGIE, 2);
            Pizza pizza2 = new Pizza(PizzaSize.MEDIUM, PizzaType.PEPPERONI, 1);
            Pizza pizza3 = new Pizza(PizzaSize.LARGE, PizzaType.BBQCHICKEN, 2);
            System.out.println(pizza1.printOrderSummary());
            System.out.println(pizza2.printOrderSummary());
            System.out.println(pizza3.printOrderSummary());
    }
}

