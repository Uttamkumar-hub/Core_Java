package com.Practice;

public class fibonacci {

	public static void main(String[] args) {
		  int n=10;
		  int a=0, b=1;
		  for(int i=1;i<=n;i++) {

			  int c=a+b;
			  a=b;
			  b=c;
			  System.out.println(a+" ");
			  
		  }

		// TODO Auto-generated method stub

	}
}