package com.Arrays;

import java.util.Scanner;
public class CopyElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Elements:");
		int n=sc.nextInt();
		
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		
		System.out.print("Enter " + n + " Elements: ");
		for(int i=0;i<n;i++) {
		arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			arr2[i]=arr1[i];
		}
		System.out.print("Elements Copied to new Array:");
		for(int i=0;i<n;i++) {
			System.out.print(arr2[i]+" ");
		}
	sc.close();	
	}

}
