package edu.miu.lab2.problem1;

/**
 * @author Badri Paudel
 * @since 9/3/2025
 * <p>This is the assignment for lab 2, FPP course, MIU, IA</p>
 * Program name: <b>“Problem 1: Class & Objects”</b>
 * <p> Members: Badri Paudel & Nguyen Khanh Tran </p>
 */

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Badri", "Paudel", "12345");
        Address shippingAddress1 = new Address("1000 N 4th Street", "Fairfield", "52556");
        Address billingAddress1 = new Address("Avenue St", "Chicago", "52558");
        customer1.setBillingAddress(billingAddress1);
        customer1.setShippingAddress(shippingAddress1);

        Customer customer2 = new Customer("Nguyen", "Tran", "56789");
        Address shippingAddress2 = new Address("1000 N 4th Street", "Fairfield", "52556");
        Address billingAddress2 = new Address("Avenue St", "Georgia", "52566");
        customer2.setBillingAddress(billingAddress2);
        customer2.setShippingAddress(shippingAddress2);


        Customer customer3 = new Customer("John", "Doe", "34345");
        Address shippingAddress3 = new Address("Baneshwar", "Kathmandu", "44600");
        Address billingAddress3 = new Address("Maitighar", "Kathmandu", "44600");
        customer3.setBillingAddress(billingAddress3);
        customer3.setShippingAddress(shippingAddress3);

        Customer[] customers = new Customer[] { customer1, customer2, customer3 };
        String cityToCheck = "Chicago";

        for(Customer customer: customers) {
            if(cityToCheck.equalsIgnoreCase(customer.getBillingAddress().getCity())) {
                System.out.println(customer);
            }
        }
    }
}
