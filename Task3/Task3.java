package com.company.Task3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        //Puncture 1
        System.out.print("Bed Radius is: ");
        Scanner scanner = new Scanner(System.in);
        double bedRadius = scanner.nextDouble();
        double Perimeter = 2 * Math.PI * bedRadius;
        double Area = Math.PI * (bedRadius * bedRadius);
        System.out.println("Perimeter of bed is: "+ Perimeter);
        System.out.println("Area of bed is: "+ Area);
        System.out.println();
        
        //Puncture 2
        System.out.print("What is your name? ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.print("Where do you live, "+name+"? ");
        Scanner scanner2 = new Scanner(System.in);
        String address = scanner2.nextLine();
        System.out.println("Your name is "+name+" and you live at "+address+".");
        System.out.println();

        //Puncture 3
        System.out.print("First city is: ");
        Scanner scanner3 = new Scanner(System.in);
        String c1 = scanner3.nextLine();

        System.out.print("Second city is: ");
        Scanner scanner4 = new Scanner(System.in);
        String c2 = scanner4.nextLine();

        System.out.print("Third city is: ");
        Scanner scanner5 = new Scanner(System.in);
        String c3 =scanner5.nextLine();

        System.out.print("First call duration is: ");
        Scanner scanner6 = new Scanner(System.in);
        double t1 = scanner6.nextDouble();

        System.out.print("Second call duration is: ");
        Scanner scanner7 = new Scanner(System.in);
        double t2 = scanner7.nextDouble();

        System.out.print("Third call duration is: ");
        Scanner scanner8 = new Scanner(System.in);
        double t3 = scanner8.nextDouble();

        double unitPerMinute = 2;

        double call1 = unitPerMinute*t1;
        double call2 = unitPerMinute*t2;
        double call3 = unitPerMinute*t3;

        double Sum = (call1)+(call2)+(call3);

        System.out.println("You should pay for the call from "+c1+" : " +call1+" hryvnas.");
        System.out.println("You should pay for the call from "+c2+" : " +call2+" hryvnas.");
        System.out.println("You should pay for the call from "+c3+" : " +call3+" hryvnas.");
        System.out.println("Sum of all payments: "+Sum+" hryvnas.");
    }
}
