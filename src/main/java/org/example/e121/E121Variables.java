package org.example.e121;

public class E121Variables {
    int intValue;
    double doubleValue;
    char charValue;

    void print() {
        System.out.println(intValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
    }

    public static void main(String[] args) {
        E121Variables instance1 = new E121Variables();
        instance1.intValue = 10;
        instance1.doubleValue = 10.23;
        instance1.charValue = 'a';
        E121Variables instance2 = new E121Variables();
        instance2.intValue = 100;
        instance2.doubleValue = 100.23;
        instance2.charValue = 's';

        instance1.print();
        instance2.print();
    }
}
