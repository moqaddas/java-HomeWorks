package org.example.e27;

import java.sql.SQLOutput;

public class E27GradeCalculatorElseIf {
    public static void main(String[] args) {

        int score = 85;
        if (score >= 90 && score <= 100) {
        System.out.println("Your grade is: A");
        }else if (score >= 80 && score <= 89) {
            System.out.println("Your grade is: B");
        }else if (score>=70 && score <=79){
            System.out.println("Your grade is: C");
        }else if (score>= 60 && score <=69){
            System.out.println("Your grade is: D");
        }else{
            System.out.println("Your grade is: F");
        }
    }
}
