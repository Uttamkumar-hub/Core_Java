package com.Scanner;

public class BankApplication {
	String customerName;
	String customerAddress;
	long phoneNumber;
	double balance;
	
	BankApplication(String customerName, String customerAddress, long phoneNumber, double balance){
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
		System.out.println("Account Created Successfully");
	}
	public void deposit(double amount) {
		if(amount<=0) {
			System.out.println("Enter Valid Message");
		}else {
			balance+=amount;{
				System.out.println("Deposit Successfull Avail Balnce:"+balance);
			}
		}
		}
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid withdrawal amount");
		}
		else if(amount>balance) {
			System.out.println("Insufficient funds");
		}else {
			balance=balance-amount;
			System.out.println("Withdrawal Successful, remaining balance : " +balance);
			}
		}
		//Display Balance
		public void displayBalance() {
		System.out.println("Available Balance : " +balance);
		}
}
