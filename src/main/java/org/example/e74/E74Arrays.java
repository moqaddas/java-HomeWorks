package org.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] multiyplArray = new int[5];
        System.out.println("Input:");
        for (int i = 0; i < multiyplArray.length; i++) {
            multiyplArray[i] = input.nextInt();
        }
        System.out.println("Output:");
        for (int i = 0; i < multiyplArray.length; i++) {
            multiyplArray[i] *= 10;
            System.out.println(multiyplArray[i]);
        }
        input.close();
    }
}
