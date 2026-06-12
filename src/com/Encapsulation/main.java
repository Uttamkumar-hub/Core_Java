package com.Encapsulation;

public class main {
    public static void main(String[] args) {
        main mn = new main();

        mn.setSalary(50000);   // valid
        System.out.println("Salary: " + emp.getSalary());

        mn.setSalary(-1000);   // invalid
        System.out.println("Salary: " + emp.getSalary());
    }
}
