package com.Instance_Methods;

public class Example4 {
	public static String hospitalName;
	String patientName;
	int age;
	
	public void printdetails() {
		System.out.println("Hospital Name:"+hospitalName);
		System.out.println("Patient Name:"+patientName);
		System.out.println("Patient Age:"+age);
	}

	public static void main(String[] args) {
		hospitalName="City Care Hospital";
		Example4 obj1=new Example4();
		Example4 obj2=new Example4();
		obj1.patientName="John Doe";
		obj1.age=45;
		obj1.printdetails();
		System.out.println("-----------------------");
		obj2.patientName="Emma Watson";
		obj2.age=30;
		obj2.printdetails();
		System.out.println("------------------------");
		
		// TODO Auto-generated method stub

	}

}
