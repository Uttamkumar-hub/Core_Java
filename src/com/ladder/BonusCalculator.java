package com.ladder;

public class BonusCalculator {
	public double calculateBonus(int experience, int rating, double salary) {
		if(experience>5&& rating>9) {
			return 0.5*salary;
		}
		else if ((experience>3&&experience<5)&&(rating>7&&rating<9)){
			return 0.3*salary;
		}
		else if ((experience>1&&experience<3)&&(rating>5&&rating<7)){
			return 0.3*salary;
	}
		else {
			return 0.0;
		}
		
		}
	public static void main(String[] args) {
		BonusCalculator obj= new BonusCalculator();
		System.out.println(obj.calculateBonus(6, 10, 25000.0));
		
		// TODO Auto-generated method stub

	}

}
