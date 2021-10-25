package com.company.Task4;
import java.util.Scanner;
public class Person {
    private String name;
    private int birthYear;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age(){
        return 2021-getBirthYear();
    }

    static Person input() {
        Scanner scan = new Scanner(System.in);
        Person p = new Person();
        System.out.print("Name: ");
        p.setName(scan.next());
        System.out.print("Birth year: ");
        p.setBirthYear(scan.nextInt());
        return p;
    }
    public void output(){
        System.out.println("Information about person:");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+age());
    }
    public void changeName(String n){
        name = n;
    }

}
