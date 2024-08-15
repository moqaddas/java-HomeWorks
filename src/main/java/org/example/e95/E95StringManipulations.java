package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string");
        String text = sc.nextLine();
        String first3 = text.substring(0, 3);
        System.out.println("The first 3 letters of " + text + " is " + first3);

        sc.close();

    }
}
