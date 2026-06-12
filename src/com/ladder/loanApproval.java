package com.ladder;

public class loanApproval {
	public String checkLoanApproval(double salary, int creditScore) {
		if((salary > 80000.0)&& (creditScore > 750)) {
			return "Success";
			
		
		}
		else if((salary>= 50000&& salary<=80000)&& (creditScore>650&& creditScore<=750)){
			return "Loan Approved with Higher Interest Rate";
		}
		else if((salary>= 30000&& salary<=50000)&& (creditScore>500&& creditScore<=650)){
		return "Co-signer Required";	
		}
		else {
			return"Loan Rejected";
			
		}
	}
	public static void main(String[] args) {
		loanApproval obj=new loanApproval();
		System.out.println(obj.checkLoanApproval(40000.0, 520));
		// TODO Auto-generated method stub
	}

}
