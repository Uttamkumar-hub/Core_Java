package com.conditional;


public class Else_if_Ladder{
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
		Else_if_Ladder obj=new Else_if_Ladder();
		System.out.println(obj.calculatePremium(45, 6));
		

	}

}
