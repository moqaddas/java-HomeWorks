package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String userInput = input.nextLine();
        String reversed = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed += userInput.charAt(i);
        }
        System.out.println("In: " + userInput);
        if (userInput.equals(reversed)) {
            System.out.println("~~" + reversed + "~~");
        } else {
            System.out.println(reversed);
        }
        input.close();
    }
}