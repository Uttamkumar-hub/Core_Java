package com.Interface;

public class creditCard implements Payment{

	@Override
	public void paying(int amount) {
		System.out.println("Payment Method Choosen Credit Card");
		System.out.println("Amount After Discount:"+(amount-amount*0.2));
	}
	
		
	}

	
