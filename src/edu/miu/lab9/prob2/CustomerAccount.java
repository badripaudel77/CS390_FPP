package edu.miu.lab9.prob2;
public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("Deposit Amount Cannot be negative");
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        double remaining = balance - amount;
        if(amount > balance) {
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance.");
        }
        else if(remaining < 100 && remaining >= 0) {
            throw new AccountException("Low balance warning! Balance cannot go below $100.");
        }
        else if (amount > 0 && amount <= balance) {
            balance = remaining;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
