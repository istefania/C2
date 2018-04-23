package com.example.stef.c2;
public class Person {
    String firstName;
    String lastName;
    String addres;
    Car car;

    public Person(String firstName, String lastName, String addres, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addres = addres;
        this.car = car;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddres() {
        return addres;
    }

    public Car getCar() {
        return car;
    }

    public void printPerson() {
        System.out.println("First name:" + this.getFirstName());
        System.out.println("Last name:" + this.getLastName());
        System.out.println("Addres:" + this.getAddres());
        System.out.println("Car:" + this.getCar());
    }
}