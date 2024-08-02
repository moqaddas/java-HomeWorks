package org.example.e77;

public class E77Arrays {
    public static void main(String[] args) {

        int[] numbers = {5, 4, 8};
        int highestValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highestValue) {
                highestValue = numbers[i];
            }
        }
        System.out.println(highestValue);
    }
}
