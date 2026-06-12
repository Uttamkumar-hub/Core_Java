package com.Practice;

public class primeorNot {

	public static void main(String[] args) {
		int n= 29;
		boolean isPrime=true;
		if(n<=1)isPrime=false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		System.out.println(isPrime?"Prime":"Not Prime");
		// TODO Auto-generated method stub

	}

}