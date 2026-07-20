package com.activity;

import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {

        System.out.println("URK23CS1241");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number : ");
        int num = sc.nextInt();

        String binary = "";

        if (num == 0) {
            binary = "0";
        } else {
            while (num > 0) {
                binary = (num % 2) + binary;
                num = num / 2;
            }
        }

        System.out.println("Binary = " + binary);

        sc.close();
    }
}
