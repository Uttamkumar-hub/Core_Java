package com.PalindromePractice;


public class Example1 {
//	public static boolean printrev(int num) {
//		int tel=num;
//		int rem=0;
//		while(num>0) {
//			rem=rem*10+num%10;
//			num /=10;
//		}
//		return tel==rem;
//	}
//
//	public static void main(String[] args) {
//		System.out.println(printrev(454)?"Palindrome":"Not a Palindrome");
//		// TODO Auto-generated method stub
//
//	}
//
//}

//	public static boolean printa(int num) {
//		int tel=num;
//		int rem=0;
//		while(num>0) {
//			rem=rem*10+num%10;
//			num /=10;
//		}
//		return tel==rem;
//			
//		}
//	public static void main(String []args) {
//		System.out.println(print(251)?"Palindrome":"Not a palindrome");
//		
//	}
//}

	public static boolean get(int num) {
		int tel=num;
		int rem=0;
		while(num>0) {
			rem=rem*10+num%10;
			num /=10;
		}
		return tel==rem;
	}
	public static void main(String[] args) {
		System.out.println(get(564)?"Palindrom":"Not a palindrome");
		}
	}
