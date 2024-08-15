package org.example.e98;

public class E98StringManipulations {
    public static void main(String[] args) {

        String given = "Hello Syntax friends";
        String Syntax = given.substring(6,12);
        String Welcome = "Welcome";
        String family = "family";
        String newStr = Welcome + " " + Syntax + " " + family;
        System.out.println(newStr);
    }
}
