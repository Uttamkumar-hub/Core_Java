package com.Polymerphim;

class Employee {
	
	public void calculateSalary(int salary) {
		System.out.println("Salary: " + salary);
		}
	
	public void calculateSalary(int salary, int bonus) {
        System.out.println("Salary with Bonus: " + (salary + bonus));
    	}
	}

public class Example1 {
	public static void main(String[] args) {
		Employee emp = new Employee();

        emp.calculateSalary(30000);
        emp.calculateSalary(30000, 5000);
        }
	}