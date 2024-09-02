package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }
        for (String name : names) {
            if (name.length() >= 3) {
                System.out.println(name.substring(0, 3));
            } else {
                System.out.println(name);
            }
        }
    }
}


