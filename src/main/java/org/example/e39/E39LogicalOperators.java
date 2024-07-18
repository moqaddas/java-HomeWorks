package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your marks");
        int marks = scanner.nextInt();
        String grade="";
        if (marks < 0 || marks>100){
            System.out.println("Please enter a valid mark");
            return;
        }
        if (marks>=1 && marks<=25){
            grade="F";
        } else if (marks>=26 && marks<=45) {
            grade="E";
        } else if (marks>=46 && marks<=50) {
            grade="D";
        }else if (marks>=51 && marks<=60){
            grade="C";
        } else if (marks>=61 && marks<=80) {
            grade="B";
        } else if (marks>80) {
            grade="A";
            if (marks>=0 && marks<= 100){

            }
            System.out.println("Your grade is " +grade);
        }
    }
}