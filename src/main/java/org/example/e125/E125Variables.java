package org.example.e125;

public class E125Variables {
    static int number;

    public static void main(String[] args) {
        E125Variables.number = 200;
        E125Variables instance = new E125Variables();
        instance.number = 200;
        System.out.println(E125Variables.number);
        System.out.println(instance.number);
    }
}
