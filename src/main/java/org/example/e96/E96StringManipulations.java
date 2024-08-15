package org.example.e96;

import java.util.Scanner;

public class E96StringManipulations {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a programming language:");
        String language = sc.nextLine();
        if (language.equals("Java")) {
            System.out.println("Java is a programming language");
        } else if (language.equals("C")) {
            System.out.println("C is a procedural programming language");
        } else if (language.equals("C++")) {
            System.out.println("C++ is middle-level programming language");
        } else {
            System.out.println("Doesn't match any programming language");
        }
        sc.close();
    }
}