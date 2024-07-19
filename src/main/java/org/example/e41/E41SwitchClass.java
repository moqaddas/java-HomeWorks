package org.example.e41;

import java.util.Scanner;

public class E41SwitchClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time of day (morning, afternoon, evening, night)");
        String timeOfDay = scanner.nextLine();
        switch (timeOfDay) {
            case "morning":
                System.out.println("Recommended meal: Breakfast. ");
                break;
            case "afternoon":
                System.out.println("Recommended meal: lunch. ");
                break;
            case "evening":
                System.out.println("Recommended meal: Dinner. ");
                break;
            case "night":
                System.out.println("Recommended meal: Snack.");
                break;
            default:
                System.out.println("Invalid time of day entered");
                break;
        }
        scanner.close();
    }
}