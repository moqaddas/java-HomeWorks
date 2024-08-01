package org.example.e64;

import java.util.Scanner;

public class E64ForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Int: ");
        int end = input.nextInt();
        for (int i = 0; i < 2 * end; i++) {
            System.out.print(i + " ");
        }
    }
}
