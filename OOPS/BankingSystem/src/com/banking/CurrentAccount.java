package com.banking;

public class CurrentAccount extends Account {
    private double overdraftLimit = 500.0;

    public CurrentAccount(String accountNumber, double initialDeposit) {
        super(accountNumber, initialDeposit);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Exceeded overdraft limit or invalid amount.");
        }
    }
}
