package com.activity;

import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {

        System.out.println("Register Number : URK23CS1241");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
