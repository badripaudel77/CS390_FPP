package edu.miu.lab9.prob2;

public class Driver {
    public static void main(String[] args) {
        CustomerAccount customerAccount = new CustomerAccount("Badri", "123456", 2000);
        System.out.println("Initial balance: $" + customerAccount.getBalance());
        try {
            System.out.println("1.Depositing -100...");
            customerAccount.deposit(-100);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Current balance: $" + customerAccount.getBalance());


        try {
            System.out.println("2.Withdrawing 3000$ (Insufficient funds)...");
            customerAccount.withdraw(3000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            System.out.println("3.Withdrawing 1950$ (balance would drop below 100)...");
            customerAccount.withdraw(1950);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Balance after withdraw: $" + customerAccount.getBalance());



        try {
            System.out.println("4.Depositing 100...");
            customerAccount.deposit(100);
            System.out.println("Balance after deposit: $" + customerAccount.getBalance());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Withdrawing 2000...");
            customerAccount.withdraw(2000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Balance after withdraw: $" + customerAccount.getBalance());
    }
}
