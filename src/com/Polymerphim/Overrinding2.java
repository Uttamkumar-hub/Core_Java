package com.Polymerphim;

class Payment {

    public void pay() {
    	System.out.println("Payment Processing...");
        }
    }

class UPI extends Payment {

    @Override
    public void pay() {
        System.out.println("Payment Done Through UPI");
        }
    }

class CreditCard extends Payment {

    @Override
    public void pay() {
        System.out.println("Payment Done Through Credit Card");
        }
    }

public class Overrinding2 {

    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay();

        p = new CreditCard();
        p.pay();
        }
    }