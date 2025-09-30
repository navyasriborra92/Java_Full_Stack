package com.banking;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added: " + customer);
    }

    public Customer findCustomerById(String id) {
        for (Customer customer : customers) {
            if (customer.getAccount().accountNumber.equals(id)) {
                return customer;
            }
        }
        return null;
    }

    public void showAllCustomers() {
        for (Customer customer : customers) {
            customer.displayCustomerInfo();
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Show All Accounts\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter account number: ");
                    String accNo = sc.nextLine();
                    System.out.print("Enter initial deposit: ");
                    double initDep = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Account type \n 1.Savings \n 2.Current: ");
                    int type = sc.nextInt();

                    Account account = null;
                    if (type == 1) {
                        account = new SavingsAccount(accNo, initDep);
                    } else if (type == 2) {
                        account = new CurrentAccount(accNo, initDep);
                    }

                    if (account != null) {
                        Customer customer = new Customer(name, accNo, account);
                        bank.addCustomer(customer);
                    } else {
                        System.out.println("Invalid account type.");
                    }
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    String accNo2 = sc.nextLine();
                    Customer cust2 = bank.findCustomerById(accNo2);
                    if (cust2 != null) {
                        System.out.print("Enter deposit amount: ");
                        double amount = sc.nextDouble();
                        cust2.getAccount().deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    String accNo3 = sc.nextLine();
                    Customer cust3 = bank.findCustomerById(accNo3);
                    if (cust3 != null) {
                        System.out.print("Enter withdraw amount: ");
                        double amount2 = sc.nextDouble();
                        cust3.getAccount().withdraw(amount2);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    bank.showAllCustomers();
                    break;

                case 5:
                    System.out.println("Exiting. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
