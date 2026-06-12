package com.Abstraction;

public class Bike1 extends Vehicle {
	String hasSidecar;
	public Bike1(String modelName, int vechileNumber, String company, String hasSidecar) {
		super(modelName, vechileNumber, company);
		this.hasSidecar = hasSidecar;
		}
	@Override
	public void startEngine() {
		System.out.println("Starting engine with kick-start.");
		}
	@Override
	public void Touchscreen() {
		System.out.println("No");
		}
	}
