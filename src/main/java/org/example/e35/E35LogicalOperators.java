package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need a loan? (true/false)");
        boolean needsLoan = scanner.nextBoolean();
        String eligibility;
        if (needsLoan) {
            System.out.println("What is your credit score?");
            int creditScore = scanner.nextInt();
            if (creditScore < 600) {
                eligibility = "Not eligible";
            } else if (creditScore >= 600 && creditScore <= 700) {
                eligibility = "Maybe eligible";
            } else if (creditScore >= 701 && creditScore <= 800) {
                eligibility = "Eligible";
            } else if (creditScore > 800) {
                eligibility = "Definitely eligible";
            } else {
                eligibility = "Unknown";
            }
        } else {
            eligibility = "Unknown";
        }
        System.out.println("The eligibility is " + eligibility);
    }
}
