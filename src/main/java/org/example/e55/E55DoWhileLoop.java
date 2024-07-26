package org.example.e55;

import java.util.Scanner;

public class E55DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int favoriteNumber;
        do {
            System.out.println("Enter your favorite number:");
            favoriteNumber = input.nextInt();
            System.out.println("You entered: " + favoriteNumber);
        } while (favoriteNumber != 7);
        System.out.println("You've entered 7! Loop ends.");
    }
}
