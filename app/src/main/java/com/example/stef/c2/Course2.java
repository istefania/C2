package com.example.stef.c2;

public class Course2 {

    public static void main(String[] args) {


        System.out.println("x=" + calculateX(6, 10, 0.2f));
        System.out.println("suma=" + calculateSum(345));
        System.out.println("suma stringuri=" + compareString("andrei", "andreea"));
    }


    static int calculateX(int a, int b, float c) {


        float x = a * b / c;


        return (int) x;
    }

    static int calculateSum(int a) {
        int sum = 0;
        while (a != 0) {
            int x = a % 10;
            sum = sum + x;
            a = a / 10;
        }

        return sum;
    }

    static int compareString(String a, String b) {

        int lengtha = a.length();
        int lengthb = b.length();
        int sum = lengtha + lengthb;
        int comp = a.compareTo(b);

        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(a);
        System.out.println(b);

        return sum;
    }
}
