package com.Encapsulation;

class v {
    private double salary;

    // Setter with validation
    public void setSalary(double salary) {
        if(salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Salary cannot be negative.");
        }
    }

    // Getter
    public double getSalary() {
        return salary;
    }


public class Employee{
    public static void main(String[] args) {
        v emp = new v();

        emp.setSalary(50000);   // valid
        System.out.println("Salary: " + emp.getSalary());

        emp.setSalary(-1000);   // invalid
        System.out.println("Salary: " + emp.getSalary());
    }
}



