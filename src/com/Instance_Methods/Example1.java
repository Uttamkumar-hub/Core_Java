package com.Instance_Methods;

public class Example1 {
	static String showroomName;
//	Instance Variables
	String modelName;
	int price;
	
	public void Car(String Model, int Price){
		modelName=Model;
		price=Price;
	}
	void displayDetails() {


		System.out.println("Showroom Name:"+showroomName);
		System.out.println("Car Model:"+modelName);
		System.out.println("Car Price:"+price);
		System.out.println("-----------------------");
		
	}

	public static void main(String[] args) {
		Example1.showroomName="Elite Motors";
		Example1 obj1=new Example1();
		Example1 obj2=new Example1();
		obj1.modelName="Tesla Model S";
		obj1.price=80000;
		obj1.displayDetails();
		obj2.modelName="BMW X5";
		obj2.price=75000;
		obj2.displayDetails();
	

	}

}
