package com.company.Task4;

public class Task4 {
    public static void main(String[] args) {
        int numberOfPeople = 2;
        Person[] people = new Person[5];
        for (int i = 0; i < numberOfPeople; i++) {
            people[i] = Person.input();
            System.out.println();
        }
        for (int i = 0; i < numberOfPeople; i++)
        {
            people[i].output();
            System.out.println();
        }
        people[0].changeName("Ihor");
        people[0].output();
    }
}
