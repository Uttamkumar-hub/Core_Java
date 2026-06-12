package com.Instance_Methods;

public class Example3 {
	public static String storeName;
	String brand;
	int price;
	
	public void showDetails() {
		System.out.println("Store Name:"+storeName);
		System.out.println("Mobile Brand:"+brand);
		System.out.println("Mobile Price:"+price);
	}
	

	public static void main(String[] args) {
		storeName="Tech World";
		Example3 obj1=new Example3();
		Example3 obj2=new Example3();
		obj1.brand="Apple";
		obj1.price=1200;
		obj1.showDetails();
		System.out.println("--------------------");
		obj2.brand="Samsung";
		obj2.price=900;
		obj2.showDetails();
		System.out.println("--------------------");
		// TODO Auto-generated method stub

	}

}
