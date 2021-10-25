package com.company.Task1;
import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {

        System.out.println("Hole length = ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Hole width = ");
        Scanner scanner1 = new Scanner(System.in);
        double y = scanner.nextDouble();
        System.out.println("Brick length = ");
        Scanner scanner2 = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Brick width = ");
        Scanner scanner3 = new Scanner(System.in);
        double b = scanner.nextDouble();
        System.out.println("Brick height = ");
        Scanner scanner4 = new Scanner(System.in);
        double c = scanner.nextDouble();
        System.out.println();
        if (x >= a && y >= b){
            System.out.println("Congratulations! The brick fit into the hole.");
        }
        else {
            System.out.println("Unfortunately, the size did not fit(");
        }
    }
}
