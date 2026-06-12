package com.Practice;

public class countEvenOdd {
    public static void main(String[] args) {
        int n = 10;
        int even = 0, odd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}