package edu.miu.lab9.prob2;

public class Driver {
    public static void main(String[] args) {
        CustomerAccount customerAccount = new CustomerAccount("Badri", "123456", 2000);

        boolean deposited = customerAccount.deposit(100);
        System.out.println("Amount deposited : " + deposited);

        boolean withdrawn = customerAccount.withdraw(2000);
        System.out.println("Amount withdrawn : " + withdrawn);

        // Note: Code after exception will not be executed (it was tested one by one)
        // withdraw makes balance less than 100 : Throws error
        customerAccount.withdraw(50);

        // withdraw more than the balance : Throws error
        customerAccount.withdraw(100);

        //Can't deposit Negative amount :  Throws error
        customerAccount.deposit(-100);
    }
}
