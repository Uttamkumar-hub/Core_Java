package com.constructor;


public class thisExample {
	thisExample(){
		System.out.println("No Parameterized Constructor");
	}
	thisExample(String name){
		this(5000,1000);
		System.out.println("------------------");
		System.out.println("One Parameterized Constructor");
		System.out.println("Name of the Employee:"+name);
	}
	thisExample(int a, int b){
		System.out.println("------------------");
		System.out.println("Two Parameterized Constructor");
		System.out.println("Employee Salary:"+(a+b));
	}

	public static void main(String[] args) {
		thisExample obj=new thisExample("Uttham Kumar");
//		Employee obj2=new Employee(500,1000);
		// TODO Auto-generated method stub

	}

}