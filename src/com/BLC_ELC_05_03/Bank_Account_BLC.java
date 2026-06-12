package com.BLC_ELC_05_03;

public class Bank_Account_BLC {
	
	long accountNumber;
	String accountHolderName;
	double balance;
	
	//setter
	public void setNumber(long num) {
		accountNumber=num;
	}
	
	public void setName(String name) {
		accountHolderName=name;
	}

	public void setBalance(double blnce) {
		balance=blnce;
	}
	
	//getter
	public long getNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}

}
