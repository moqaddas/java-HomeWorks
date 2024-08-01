package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] daysOfWeek = new String[7];
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println("Please enter a day " + (i + 1) + " of the week:");
            daysOfWeek[i] = input.nextLine();
        }
        input.close();
        for (int i=0;i<daysOfWeek.length;i++){
            System.out.println(daysOfWeek[i]);
        }
    }
}
