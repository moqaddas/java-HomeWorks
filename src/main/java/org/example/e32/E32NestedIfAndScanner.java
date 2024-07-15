package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");
        char gender = scanner.next().charAt(0);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        if (age > 25) {
            if (gender == 'F' || gender == 'f') {
                System.out.println("Woman");
            } else {
                System.out.println("Man");
            }
        } else {
            if (gender == 'F' || gender == 'f') {
                System.out.println("Girl");
            } else {
                System.out.println("Boy");
            }
        }

        scanner.close();
    }
}