package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your electricity usage in kWh");
        int usage = input.nextInt();
        double bill = 0.0;

        if (usage < 0) {
            System.out.println("Invalid usage entered");
        } else {
            switch (usage / 100) {
                case 0: // Usage between 0 and 100 kWh
                    bill = usage * 0.12;
                    break;
                case 1: // Usage between 101 and 200 kWh
                    bill = usage * 0.15;
                    break;
                case 2: // Usage between 201 and 300 kWh
                    bill = usage * 0.20;
                    break;
                default: // Usage 301 kWh and above
                    bill = usage * 0.25;
                    break;
            }
            System.out.println("Your electricity bill is $" + bill);
        }

        input.close();
    }
}
