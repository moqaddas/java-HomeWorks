package org.example.e117;

public class E117JavaMethods {
    public static int sumEvenTox(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sumEvenToX(5) ==> " + sumEvenTox(5));
        System.out.println("sumEvenToX(8) ==> " + sumEvenTox(8));
    }
}
