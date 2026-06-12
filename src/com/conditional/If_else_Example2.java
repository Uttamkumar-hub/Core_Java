package com.conditional;


public class If_else_Example2 {

	public boolean data(int num) {
		if(num % 2==0) 
		{
			return true;
		}
		else {
			return false;
		}
	}
		public static void main(String[] args) {
			If_else_Example2 obj=new If_else_Example2();
			obj.data(12);
			System.out.println((obj.data(12)));
			
		}
		 
		
	}
