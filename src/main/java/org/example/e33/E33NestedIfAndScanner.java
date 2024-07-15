package org.example.e33;

import java.util.Scanner;

public class E33NestedIfAndScanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The value is even.");
            if (number > 1000) {
                System.out.println("The even value is large.");
            } else {
                System.out.println("The even value is just right.");
            }
        } else {
            System.out.println("The value is odd.");
            if (number > 1000) {
                System.out.println("The odd value is large.");
            } else {
                System.out.println("The odd value is just right");
            }
        }
        scanner.close();
    }
}