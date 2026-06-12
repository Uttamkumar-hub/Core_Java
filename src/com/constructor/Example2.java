package com.constructor;
public class Example2 {

	public static void main(String[] args) {
		System.out.println("<----Before Promotion----->");
		Example1 obj=new Example1(564,"Uttam Kumar", "Software Eng", 60000.0, 4);
		System.out.println("Employee ID:"+obj.getempId());
		System.out.println("Employee Name:"+obj.getempName());
		System.out.println("Designation:"+obj.getdesignation());
		System.out.println("Salary:"+obj.getempSalary());
		obj.promoteEmployee();{
		if(obj.performanceRating >= 4 ){
			System.out.println("\n<----After Promotion---->");
			System.out.println("Promoted as:" +obj.getdesignation());
			System.out.println("Updated Salary:"+obj.getempSalary());
			}
		}
	}
}

