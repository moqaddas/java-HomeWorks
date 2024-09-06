package org.example.e123;

public class E123Variables {
    int myInt;
    String myString;
    double myDouble;
    boolean myBoolean;
    float myFloat;

    void display() {
        System.out.println(myInt);
        System.out.println(myString);
        System.out.println(myDouble);
        System.out.println(myBoolean);
        System.out.println(myFloat);
    }

    public static void main(String[] args) {
        E123Variables obj = new E123Variables();
        obj.display();
    }
}
