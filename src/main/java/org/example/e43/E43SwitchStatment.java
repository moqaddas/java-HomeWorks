package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your electricity usage in kWh.");
        int usage = scanner.nextInt();
        double bill = 0;

        if (usage < 0) {
            System.out.println("Invalid usage entered");
            return;
        }
        int range = usage / 100;
        switch (range) {
            case 0:
                bill = usage * 0.12;
                break;
            case 1:
                bill = usage * 0.15;
                break;
            case 2:
                bill = usage * 0.20;
                break;
            default:
                bill = usage * 0.25;
                break;
        }
        System.out.println("Your electricity bill is $" + bill);
    }
}
