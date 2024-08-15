package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        System.out.println("In: " + userInput);
        for (int i = 0; i < userInput.length(); i += 2) {
            System.out.print(userInput.charAt(i));
        }
    }
}