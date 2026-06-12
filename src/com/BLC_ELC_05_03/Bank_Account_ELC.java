package com.BLC_ELC_05_03;


public class Bank_Account_ELC {

	public static void main(String[] args) {
		Bank_Account_BLC obj=new Bank_Account_BLC();
		
		obj.setNumber(235672389);
		obj.setName("Uttam");
		obj.setBalance(50000.07);

		System.out.println("Account Number : " +obj.getNumber());
		System.out.println("Account Holder Name : " +obj.getName());
		System.out.println("Balance : " +obj.getBalance());
		obj.setBalance(10000.39);
		System.out.println("Account Balance After Update : " +obj.getBalance());
	}

}
