package com.PredefinedFunctionalInterfaces;

import java.util.function.Predicate;
import java.util.function.Consumer;


class Employee1{
	private String empName;
	private String empDesg;
	private double employeeSalary;
	
	public Employee1(String empName, String empDesg, double employeeSalary) {
		super();
		this.empName = empName;
		this.empDesg = empDesg;
		this.employeeSalary = employeeSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee1 [Employee Name=" + empName + ", EmployeeDesignation=" + empDesg + ", EmployeeSalary=" + employeeSalary + "]";
	}
}


public class Employee {

	public static void main(String[] args) {
		Predicate<Employee1> check =new Predicate<Employee1>() {
			@Override
			public boolean test(Employee1 emp) {
				return emp.getEmployeeSalary()>10000;
				
			}
		};
		Consumer<Employee1> consumer=new Consumer<Employee1>() {
			@Override
			public void accept(Employee1 emplo) {
				emplo.setEmployeeSalary(emplo.getEmployeeSalary()+(emplo.getEmployeeSalary()*0.10));
				System.out.println(emplo.getEmployeeSalary());
			}
		};
		Employee1 emp2= new Employee1("Uttam","SE", 12000);
		Employee1 emp3= new Employee1("Srujan","QA", 20000);
		Employee1 emp4= new Employee1("Shiva","DBA", 5000);
		
		Employee1 [] emplys= {emp2, emp3, emp4};
		for(Employee1 i: emplys) {
			if(check.test(i)) {
				consumer.accept(i);
			}
		}
	}

}
