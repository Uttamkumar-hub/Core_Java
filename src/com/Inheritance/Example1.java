package com.Inheritance;

import java.util.Scanner;


class Vehicle {
    private String ownerName;
    private long vehicleNumber;
    private String vehicleType;

    public Vehicle(String ownerName, long vehicleNumber, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public void profileDetails() {
        System.out.println("Name: " + ownerName);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + vehicleType);
    }
}

class ServiceVehicle extends Vehicle {
    private String serviceCenterName;
    private String serviceCategory;

    public ServiceVehicle(String ownerName, long vehicleNumber, String vehicleType,
                          String serviceCenterName, String serviceCategory) {
        super(ownerName, vehicleNumber, vehicleType);
        this.serviceCenterName = serviceCenterName;
        this.serviceCategory = serviceCategory;
        System.out.println("Vehicle Profile has been created Successfully..!");
    }

    public void updateServiceCenter(String center) {
        if (center == null || center.equals("")) {
            System.out.println("Invalid Service update");
        } else {
            this.serviceCenterName = center;
        }
    }

    public void updateServiceCategory(String category) {
        if (category == null || category.equals("")) {
            System.out.println("Invalid category");
        } else {
            this.serviceCategory = category;
        }
    }

    public void vehicleUpdatedDetails() {
        profileDetails();
        System.out.println("Service Center: " + serviceCenterName);
        System.out.println("Category: " + serviceCategory);
    }
}

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Owner Name:");
        String name = sc.nextLine();

        System.out.println("Enter Vehicle Number:");
        long num = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter Vehicle Type:");
        String type = sc.nextLine();

        System.out.println("Enter Service Center:");
        String center = sc.nextLine();

        System.out.println("Enter Category:");
        String category = sc.nextLine();

        ServiceVehicle sv = new ServiceVehicle(name, num, type, center, category);

        boolean result = true;

        while (result) {
            System.out.println("1.Update Category"
            		+ "\n2.Update Center"
            		+ "\n3.View Details"
            		+ "\n4.Exit");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter new category:");
                    String cat = sc.nextLine();
                    sv.updateServiceCategory(cat);
                    break;

                case 2:
                    System.out.println("Enter new center:");
                    String cen = sc.nextLine();
                    sv.updateServiceCenter(cen);
                    break;

                case 3:
                    sv.vehicleUpdatedDetails();
                    break;

                case 4:{
                	System.out.println("ThankYou..!");
                }
                    result = false;
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
        sc.close();
    }
}