package org.example.e85;

public class E85NestedForLoops {
    public static void main(String[] args) {

        int totalRows = 7;

        for (int row = 1; row <= totalRows; row++) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        for (int row = totalRows - 1; row >= 1; row--) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
