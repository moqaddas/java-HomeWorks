package org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] reversedNums = new int[5];
        System.out.println("Input:");
        for (int i = 0; i < reversedNums.length; i++) {
            reversedNums[i] = input.nextInt();
        }
        System.out.println("Output:");
        for (int i = reversedNums.length - 1; i >= 0; i--) {
            System.out.println(reversedNums[i]);
        }
        input.close();
    }
}
