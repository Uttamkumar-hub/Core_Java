package com.constructor;

public class Example1 {
	int empId;
	String empName;
	String designation;
	double empSalary;
	int performanceRating;
	
	public Example1(int empId, String empName, String designation, double empSalary, int performanceRating ) {
		this.empId=empId;
		this.empName=empName;
		this.designation=designation;
		this.empSalary=empSalary;
		this.performanceRating=performanceRating;
		
		
}
	//getters//
	public int getempId() {
		return empId;
		
}
	public String getempName() {
		return empName;
	}
	public String getdesignation() {
		return designation;
	}
	public double getempSalary() {
		return empSalary;
	}
	public int getperformanceRating() {
		return performanceRating;
	
}
	//setters//
	public void setDesignation(String designation) {
		this.designation=designation;
		
	}
	public void setSalary(double empSalary) {
		this.empSalary=empSalary;
}
	
	public void promoteEmployee() {
		if(performanceRating >= 4 ){
			designation="Sinior "+ designation;
			empSalary=empSalary+0.2*empSalary;
		}
		else {
			System.out.println("\nNo Promotion");
		}
	
	
}

}
