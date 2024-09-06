package org.example.e132;

public class E132StaticKeyword {
    public static int[][] reduce10(int[][] nums) {
        int[][] result = new int[nums.length][nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                result[i][j] = nums[i][j] - 10;
            }
        }
        return result;
    }

    // Main method to test the reduce10 method
    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };

        int[][] output = reduce10(input);

        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}