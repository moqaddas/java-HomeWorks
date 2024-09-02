package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        System.out.println("In: " + input);
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            char in = input.charAt(i);
            if (vowels.indexOf(in) != -1) {
                System.out.print(in);
            }
        }
        System.out.println();
    }
}
