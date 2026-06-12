package com.Inheritance;

import java.util.Scanner;

class InsurancePolicy{
	private String name;
	private String policyType;
	private double policyAmount;
	private double approvedAmount;
	private String policyStatus;
	
	public InsurancePolicy(String name, String policyType, double policyAmount, double approvedAmount,
			String policyStatus) {
		super();
		this.name = name;
		this.policyType = policyType;
		this.policyAmount = policyAmount;
		this.approvedAmount = approvedAmount;
		this.policyStatus = policyStatus;
		System.out.println("Proflie Created Successfully..!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public double getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}

	public double getApprovedAmount() {
		return approvedAmount;
	}

	public void setApprovedAmount(double approvedAmount) {
		if(approvedAmount<0) {
			System.out.println("Invalid Amount");
		}
		this.approvedAmount = approvedAmount;
		System.out.println("Update Successfull");
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
		System.out.println("Status Updated Success");
	}
	
	public void proflieDetails() {
		System.out.println("Customer Name:"+name);
		System.out.println("Policy Type:"+policyType);
		System.out.println("Policy Amount:" +policyAmount);
		System.out.println("Approved Amount:"+approvedAmount);
		
	}
	
	
	
}





public class Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("");
		// TODO Auto-generated method stub

	}

}
