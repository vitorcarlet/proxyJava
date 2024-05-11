package serviceImpl;

import service.BankAccount;

public class RealBankAccount implements BankAccount {
    private double balance;
    private double creditLimit;

    public RealBankAccount(double initialBalance, double creditLimit) {
        this.balance = initialBalance;
        this.creditLimit = creditLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getLimit() {
        return creditLimit;
    }
}