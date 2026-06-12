package com.Abstraction;

public class Car2 extends Vehicle {
	int numberOfDoors;
	String hasSunroof;
	
	public Car2(String modelName, int vechileNumber, String company, int numberOfDoors, String hasSunroof) {
		super(modelName, vechileNumber, company);
		this.numberOfDoors = numberOfDoors;
		this.hasSunroof = hasSunroof;
		}
	
	@Override
	public void startEngine() {
		System.out.println("Starting engine with key ignition.");
		}
	
	@Override
	public void Touchscreen() {
		System.out.println("Yes");
		}
	}
