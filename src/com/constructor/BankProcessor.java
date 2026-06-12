package com.constructor;

public class BankProcessor {

	public static void main(String[] args) {
		BankAccount obj=new BankAccount(22146625, "Uttam Kumar", 2000);
			System.out.println("-----ACCOUNT DETAILS-----");
			System.out.println("Account Number:"+obj.accountNumber);
			System.out.println("Account Holder:"+obj.accountHolder);
			System.out.println("Balance:"+obj.balance);
			obj.deposit(20000.0);
			obj.withdraw(5000.0);
			System.out.println("Update Balance:"+obj.balance);
		// TODO Auto-generated method stub

	}

}
