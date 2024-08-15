package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String userInput = input.nextLine();
        String normalInput = userInput.replaceAll("\\s+", " ").toLowerCase();

    }
}
