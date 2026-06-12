package com.ladder;

public class Movietheater {
	public double getTicketPrice(int age) {
		if(age<5) {
			return 0.0;
		}
			else if(age>5&& age<12) {
				return 5.0;
			}
			else if(age>13&& age<60) {
				return 10.0;
		}
			else if(age>60) {
			return 0.5*5.0;
			}
			else {
				return 0.0;
			}
	}
	public static void main(String[] args) {
		Movietheater obj=new Movietheater();
		System.out.println(obj.getTicketPrice(22));
		// TODO Auto-generated method stub

	}

}
