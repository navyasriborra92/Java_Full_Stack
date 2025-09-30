package com.banking;

public class Customer {
    private String name;
    private String id;
    private Account account;

    public Customer(String name, String id, Account account) {
        this.name = name;
        this.id = id;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer: " + name + " | ID: " + id);
        account.displayInfo();
    }
}
