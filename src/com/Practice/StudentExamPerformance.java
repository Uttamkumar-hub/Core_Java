package com.Practice;

import java.util.Scanner;

class Student {

    private String studentName;
    private int rollNumber;

    public Student(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        }

    public void displayStudentDetails() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
    	}
	}

class ExamStudent extends Student {

    private int subjectsCount;
    private int totalMarks;
    private double average;
    private String grade;

    public ExamStudent(String studentName, int rollNumber) {
        super(studentName, rollNumber);
        System.out.println("Student Academic Profile Created Successfully!");
    	}

    public void addMarks(int marks) {

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
            return;
            }

        totalMarks += marks;
        subjectsCount++;

        System.out.println("Marks Added Successfully");
    	}

    public void calculateResult() {

        if (subjectsCount == 0) {
            System.out.println("No Marks Available");
            return;
        	}

        average = (double) totalMarks / subjectsCount;

        if (average >= 90)
            grade = "A+";
        else if (average >= 75)
            grade = "A";
        else if (average >= 60)
            grade = "B";
        else if (average >= 40)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("Result Calculated Successfully");
    	}

    public void displaySummary() {

        System.out.println("\n===== STUDENT REPORT =====");
        displayStudentDetails();
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average     : " + average);
        System.out.println("Grade       : " + grade);
    	}
	}

public class StudentExamPerformance{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        int roll = sc.nextInt();

        ExamStudent student = new ExamStudent(name, roll);

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Marks");
            System.out.println("2. Calculate Result");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Enter Marks : ");
                int marks = sc.nextInt();
                student.addMarks(marks);
                break;

            case 2:
                student.calculateResult();
                break;

            case 3:
                student.displaySummary();
                break;

            case 4:
                System.out.println("Thank You!");
                break;

            default:
                System.out.println("Invalid Choice");
            	}

        	}
        while (choice != 4);

        sc.close();
    	}
	}