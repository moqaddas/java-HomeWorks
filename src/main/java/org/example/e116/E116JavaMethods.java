package org.example.e116;

public class E116JavaMethods {
   public static boolean bothEven(int a, int b){
       return a % 2 == 0 && b % 2 == 0;
   }

    public static void main(String[] args) {
        System.out.println(bothEven(1, 4));
    }
}
