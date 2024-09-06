package org.example.e126;

public class E126Variables {
    static int instanceCount = 0;

    public E126Variables() {
        instanceCount++;
    }

    public static void main(String[] args) {
        new E126Variables();
        new E126Variables();
        new E126Variables();
        System.out.println(instanceCount);
    }
}
