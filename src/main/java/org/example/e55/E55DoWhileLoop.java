package org.example.e55;

import java.util.Scanner;

public class E55DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int favoriteNumber;
        do {
            System.out.println("Enter your favorite number");
            favoriteNumber = scan.nextInt();
        }while (favoriteNumber!=7);
    }
}
