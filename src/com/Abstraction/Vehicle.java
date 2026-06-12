package com.Abstraction;

public abstract class Vehicle {
	String modelName;
	int VechileNumber;
	String company;
	public Vehicle(String modelName, int vechileNumber, String company) {
		this.modelName = modelName;
		this.VechileNumber = vechileNumber;
		this.company = company;
		}
	public abstract void startEngine();
	public abstract void Touchscreen();
	public void fuelType() {
		System.out.println("Petrol");
		}
	}