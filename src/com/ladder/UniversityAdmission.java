package com.ladder;

public class UniversityAdmission {
	public String evaluateAdmission(int marks, boolean sportsAchivements) {
		if(marks>95) {
			return "Admitted with Scholarship";
			
		}
		else if(marks>85&&marks<=94) {
			return "Admitted without Scholarship";
		}
		else if((marks>70&&marks<=84)&& (sportsAchivements)) {
			return "Admitted under Sports Quota";
		}
		else if(marks>=60&&marks<=69)  {
			return "Interview Required";
			}
		else {
			return "Admission Rejected";
		}
		}

	public static void main(String[] args) {
		UniversityAdmission obj=new UniversityAdmission();
		System.out.println(obj.evaluateAdmission(64, true));
		// TODO Auto-generated method stub

	}

}
