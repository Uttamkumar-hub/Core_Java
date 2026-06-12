package com.Abstraction;

public class Truck3 extends Vehicle{
	double cargoCapacity;
	public Truck3(String modelName, int vechileNumber, String company, double cargoCapacity) {
		super(modelName, vechileNumber, company);
		this.cargoCapacity = cargoCapacity;
		}

	@Override
	public void startEngine() {
		System.out.println("Starting engine with heavy-load warm-up.");
		}
	@Override
	public void fuelType() {
		System.out.println("Diesel");
		}
	@Override
	public void Touchscreen() {
		System.out.println("No");
		}
	}
