package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {


        int rows = 5;
        int cols = 10;
        int[][] multiplicationTable = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                multiplicationTable[i][j] = (i + 6) * (j + 1);
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(multiplicationTable[i][j] + " ");
            }
            System.out.println();
        }
    }
}
