package com.Polymerphim;

class Vehicle {
	public void start() {
		System.out.println("Vehicle Starts");
		}
	}
class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car Starts with Key");
    	}
	}

public class Overriding {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.start();
		}
	}