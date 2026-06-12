package com.While_loop;

public class Example1 {
	public static void print(int num) {
		int rem =0;
		while(num !=0){
			rem=rem*10+num%10;
			num /=10;
			System.out.println(rem);
			
		}
	}

	public static void main(String[] args) {
		print(123);
		
		// TODO Auto-generated method stub

	}

}
