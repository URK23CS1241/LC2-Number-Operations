package com.activity;

import java.util.Scanner;

public class Activity5 {

    public static void main(String[] args) {

        System.out.println("URK23CS1241");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {

            if (num % i == 0) {
                System.out.println("Smallest Exact Divisor = " + i);
                break;
            }
        }

        sc.close();
    }
}
