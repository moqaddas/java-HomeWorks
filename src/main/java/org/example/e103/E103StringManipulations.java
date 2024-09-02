package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("In: "+ input);
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i)+ " ");
        }
    }
}
