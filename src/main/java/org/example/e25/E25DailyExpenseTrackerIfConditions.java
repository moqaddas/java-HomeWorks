package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        double morningExpenses = 20.99;
        int afternoonExpenses = 15;
        double eveningExpenses = 11.50;
        double totalExpenses = morningExpenses + afternoonExpenses + eveningExpenses;
        double budget = 100.0;
        System.out.printf("Your total daily expense is: $%.2f " ,totalExpenses);
        if (totalExpenses <=budget) {
            System.out.println("You are within the budget.");
        } else {
            System.out.println("You have exceeded the budget.");
        }
      }
    }