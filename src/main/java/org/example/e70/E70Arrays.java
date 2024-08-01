package org.example.e70;

public class E70Arrays {
    public static void main(String[] args) {

        int[]years=new int[11];
        for (int i = 0; i < years.length; i++) {
            years[i] = 2010 + i;
        }
        for (int i = 0; i < years.length; i++) {
            System.out.println(years[i]);
        }
    }
}
