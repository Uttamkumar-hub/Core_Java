package com.Anonymus.FunctionalInterfaces;

interface numberChecker{
	boolean checkNumber(int number);
}

interface charChecker{
	void checkChar(char ch);

//	void charChecker(String string);
}
public class Example1{
	 
	public static boolean isPrime(int number)
	{
		if(number<1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
public static void main(String [] args) {
	numberChecker numCheck=new numberChecker() {
		@Override
		public boolean checkNumber(int number) {
			return isPrime(number);
		}
	};
	int num=8; 
	
if(numCheck.checkNumber(num)) {
	System.out.println(num+ " Is Prime");
}
else {
	System.out.println(num+ " Is Not Prime");
}

	charChecker chCheck=new charChecker() {
		@Override
		public void checkChar(char ch) {
			int ascii=(int)ch;
			if(isPrime(ascii)) {
				System.out.println("ASCII Value of"+ch+ascii+  " Is Prime");
			}
			else {
				System.out.println("Ascii Value of" +ch +ascii+ " Not Prime");
			}
		}

//		@Override
//		public void charChecker(String string) {
//			// TODO Auto-generated method stub
//			
//		}
	};
	chCheck.charChecker("A");
}                                      

}
