package com.pluralsight;

public class mathApp {
    public static void main(String[] args) {
        int bobSalary = 200000;
        int garySalary = 300000;

        int highestSalary = Math.max(bobSalary ,  garySalary);


        System.out.println("The highest salary is..." + highestSalary);

        double carPrice , truckPrice;

       carPrice = 3500;
       truckPrice = 50000;

       System.out.println("Minimum car price:" + Math.min(carPrice , truckPrice));

       double radius = 7.25;
       double areaOfCircle = Math.PI * Math.pow(radius, 2);
       System.out.println("Area of circle with" + radius +" is " + areaOfCircle);









    }
}
