package org.example.e76;

public class E76Arrays {
    public static void main(String[] args) {

        double[][] doubles = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}
        };
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                doubles[i][j] *= 2;
            }
        }
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                System.out.print(doubles[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
