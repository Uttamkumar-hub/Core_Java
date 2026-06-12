package com.Scanner;
import java.util.Scanner;
public class ELCbank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter Adress : ");
		String address=sc.nextLine();
		
		System.out.println("Enter Phone Number : ");
		long number=sc.nextLong();
		
		System.out.println("Enter Initial Balance :");
		double balance=sc.nextDouble();
		
		BankApplication account=new BankApplication(name, address, number, balance);
		int option=0;
		while(option!=4) {
			System.out.println("\n--------Select an option from below--------");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Display Balance");
			System.out.println("4.Exit");
			System.out.println("Choose option[1-4] :");
			
			option=sc.nextInt();
			switch(option){
			case 1:
				System.out.println("Enter your withdrawal amount : ");
				double wAmount=sc.nextDouble();
				account.withdraw(wAmount);
				break;
			case 2:
				System.out.println("Enter deposit money : ");
				double dAmount=sc.nextDouble();
				account.deposit(dAmount);
				break;
			case 3:
					account.displayBalance();
				break;
			case 4:
				System.out.println("Thank You!");
				break;
				
			default:
				System.out.println("Invalid Option");
				break;
			}
		}
		sc.close();
	}
}

