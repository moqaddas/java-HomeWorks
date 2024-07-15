package org.example.e30;

import java.util.Scanner;

public class E30ScannerClass {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println( "Please enter the month number:");

        int monthNumber=input.nextInt();


        if (monthNumber>12 || monthNumber<1){
            System.out.println("Invalid");
        }else {
            String[] months ={
                    "January" , "February" , "March" , "April" ,"May" , "June",
                    "July" , "August" , "September" , "October" , "November" , "December"
            };
            System.out.println(months [monthNumber-1]);

        }
    }
}
