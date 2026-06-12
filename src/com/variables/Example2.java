package com.variables;

//Instance/Non-Static Method
public class Example2 {
	String name; 
	
    public static void main(String[] args) {
    	Example2 obj = new Example2();
        obj.name = "Uttam";

        System.out.println("Name: " + obj.name);
    }
}
