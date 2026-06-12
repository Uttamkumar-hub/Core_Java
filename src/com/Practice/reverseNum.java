package com.Practice;

public class reverseNum {
	public static void printReverse(int num) {
		int rem=0;
		while(num!=0) {
			rem=rem*10+num%10;
			num /=10;
		}
		System.out.println(rem);
	}
	public static void main(String[] args) {
		printReverse(5640304);
	}
}
