package com.example.stef.c2;

public class Pb4 {

    public static void main(String[] args) {

        checkIfPalindrom("ana");
        checkIfPalindrom("anaf");

    }

    static void checkIfPalindrom(String a) {

        int ok = 0;
        int j = a.length() - 1;
        for (int i = 0; i < j / 2; i++) {

            if (a.charAt(i) != a.charAt(j)) {
                ok=1;
            }
        }
        if (ok==1){
            System.out.println("No.");
        }
        else{
            System.out.println("Yes");
        }
    }
}
