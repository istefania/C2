package com.example.stef.c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListPerson {
    public static void main(String[] args) {

        Car car1 = new Car("bbbb", "ggggg", "hhhh", 120);
        Person person1 = new Person("ana", "sjgdjsd", "kjhkjsd", car1);
        Car car2 = new Car("bbbb", "ggggg", "hhhh", 100);
        Person person2 = new Person("maria", "sjgdjsd", "kjhkjsd", car2);
        Car car3 = new Car("bbbb", "ggggg", "hhhh", 101);
        Person person3 = new Person("ana-maria", "sjgdjsd", "kjhkjsd", car3);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        Collections.sort(personList, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return Integer.valueOf(p1.firstName.length()).compareTo(p2.firstName.length());
            }
        });

        for (int i = 0; i < personList.size(); i++) {
            System.out.println("Persoana:" + personList.get(i).getFirstName());
        }

        int maxLength = 0;
        int k = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getFirstName().length() > maxLength) {
                maxLength = personList.get(i).getFirstName().length();
                k = i;
            }
        }
        System.out.println("Lungimea maxima este:" + maxLength);
        System.out.println("Numele cel mai lung este:" + personList.get(k).getFirstName());

        int maxWeight = 0;
        int j = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getCar().getWeight() > maxWeight) {
                maxWeight = personList.get(i).getCar().getWeight();
                j = i;
            }
        }
        System.out.println("Greutatea maxima este:" + maxWeight);
        System.out.println("Persoana cu cea mai grea masina este:" + personList.get(j).getFirstName());
    }
}

