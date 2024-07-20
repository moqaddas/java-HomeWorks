package org.example.e54;

public class E54DoWhileLoop {
    public static void main(String[] args) {
        int counter = 10;
        do {
            System.out.println(counter);
            counter--;
        } while (counter > 0);
        System.out.println("Countdown complete!");
    }
}
