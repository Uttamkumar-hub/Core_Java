package com.Interface;

public class Upi implements Payment {

	@Override
	public void paying(int amount) {
		System.out.println("Payment Method Choosen UPI");
		System.out.println("Amount Paid bye UPi"+amount);
		
	}

}
