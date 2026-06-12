package com.loops;

public class LCM {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 18;
        int lcm = 0;

        int max = (num1 > num2) ? num1 : num2;

        for(int i = max; ; i++) {
            if(i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("LCM = " + lcm);
    }
}
