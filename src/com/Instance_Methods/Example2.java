package com.Instance_Methods;

public class Example2 {
	public static String libraryName;
	String title;
	String author;
	
	public void displayDetails() {
		System.out.println("Library Name:"+libraryName);
		System.out.println("Book Title:"+title);
		System.out.println("Name of the Author:"+author);
	}
	

	public static void main(String[] args) {
		libraryName="City Public Library";
		Example2 obj1=new Example2();
		Example2 obj2=new Example2();
		obj1.title="The Great Gatsby";
		obj1.author="F. Scott Fitzgerald";
		obj1.displayDetails();
		System.out.println("----------------------------");
		obj2.title="1984";
		obj2.author="George Orwell";
		obj2.displayDetails();
		System.out.println("----------------------------");
		
		
		
		// TODO Auto-generated method stub

	}

}
