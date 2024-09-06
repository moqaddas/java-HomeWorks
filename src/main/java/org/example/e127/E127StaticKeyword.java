package org.example.e127;

public class E127StaticKeyword {
    public String nonStaticMethod() {
        System.out.println("Programming is amazing.");
        return "Programming is amazing.";
    }

    static String staticMethod() {
        System.out.println("Java is awesome.");
        return "Java is awesome.";
    }

    public static void main(String[] args) {
        E127StaticKeyword instance = new E127StaticKeyword();
        instance.nonStaticMethod();
        E127StaticKeyword.staticMethod();
    }
}
