package com.constructor;

public class BankAccount {
	int accountNumber;
	String accountHolder;
	double balance;
	
	public BankAccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	//getter//
	public int getAccountNumber(){
	return getAccountNumber();	
	}
	public String getAccountHolder() {
		return getAccountHolder();
	}
	public double getBalance() {
		return getBalance();
	}
	//setters//
	public void setBalance(double balance) {
		this.balance=balance;
	}
	//logic method//
	public void deposit(double amount) {
		if(amount>=0);{
			balance += amount;
			System.out.println("Deposit:"+ amount);
		}
	}
	public void withdraw(double amount) {
		if(amount>0) {
			if (balance>=amount) {
				balance -=amount;
				System.out.println("Withdraw:"+amount);
				
			}
			else {
				System.out.println("Insufficient Balance");
			}
		}
	}
		
		}
			
	
		
		


