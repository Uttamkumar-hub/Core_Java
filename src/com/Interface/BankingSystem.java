package com.Interface;

import java.util.Scanner;

interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);

    default void transactionStatus() {
        System.out.println("Transaction Completed Successfully");
    	}
    static void bankingRules() {
        System.out.println("Maintain Minimum Balance 1000 in Account");
    	}
	}

class SavingsAccount implements Transaction {

    private String customerName;
    private double balance;

    public SavingsAccount(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;

        System.out.println("Account Created Successfully!");
    	}

    @Override
    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid Deposit Amount");
            return;
        	}
        balance += amount;
        System.out.println("Deposited Amount : " + amount);
        transactionStatus();
        }

    @Override
    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        	}
        else if(amount > balance) {
            System.out.println("Insufficient Balance");
        	}
        else {
            balance -= amount;
            System.out.println("Withdrawn Amount : " + amount);
            transactionStatus();
        	}
    	}

    public void displayAccountDetails() {
        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Available Balance : " + balance);
    	}
	}

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("===== BANKING TRANSACTION SYSTEM =====");
        System.out.print("Enter Customer Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance : ");
        double balance = sc.nextDouble();
        SavingsAccount account =new SavingsAccount(name, balance);
        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Account Details");
            System.out.println("4. Banking Rules");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch(choice) {

            case 1:
                System.out.print("Enter Deposit Amount : ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                break;

            case 2:
                System.out.print("Enter Withdrawal Amount : ");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;

            case 3:
                account.displayAccountDetails();
                break;
                
            case 4:
                Transaction.bankingRules();
                break;

            case 5:
                System.out.println("Thank You for Using Banking System");
                break;
                
            default:
                System.out.println("Invalid Choice");
            	}
            } while(choice != 5);
        sc.close();
        }
    }
