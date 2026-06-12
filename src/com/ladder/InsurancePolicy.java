package com.ladder;

public class InsurancePolicy{
	public String calculatePremium(int age, int experience) {
		if(age>50&&experience>10) {
			return "Lowest Premimum";
		}
		else if((age>30&& age<50)&&(experience>5)) {
			return "Moderate Premium";
	}
		else if((age>18&& age<30)&&(experience<5)) {
			return "Highest Premium";
	}
		else {
			return "Not Eligible for Insurance";
		}
	}

	public static void main(String[] args) {
		InsurancePolicy obj=new InsurancePolicy();
		System.out.println(obj.calculatePremium(45, 6));
		// TODO Auto-generated method stub

	}

}
