package com.operators;


public class operators {
    public static void main(String[] args) {

        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // 3. Logical Operators
        System.out.println("\n=== Logical Operators ===");
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        // 4. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int c = 10;
        c += 5;
        System.out.println("c += 5 → " + c);
        c -= 3;
        System.out.println("c -= 3 → " + c);
        c *= 2;
        System.out.println("c *= 2 → " + c);

        // 5. Unary Operators
        System.out.println("\n=== Unary Operators ===");
        int d = 10;
        System.out.println("++d = " + (++d)); // pre-increment
        System.out.println("d-- = " + (d--)); // post-decrement
        System.out.println("Final d = " + d);
    }
}
