package com.Exception.Handling;

public class Example1 {
	public static void main(String[] args) {
//		int a=1000/0;
//		System.out.println("Hi Uttam Kumar");
//		
//		
		try {
			int a=1000/0;
		}
		catch(Throwable e) {
			System.out.println("Hello ");
		}
		
		
		
		
//		Throwable th =new Throwable("Runtime Exception");
//		System.out.println(th.getMessage());

	}

}
