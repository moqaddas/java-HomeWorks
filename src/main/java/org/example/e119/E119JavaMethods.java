package org.example.e119;

public class E119JavaMethods {
    public static String censorLetter(String str, char letter) {
        return str.replace(letter, '*');
    }

    public static void main(String[] args) {
        System.out.println(censorLetter("computer science", 'e'));
        System.out.println(censorLetter("trick or treat", 't'));
    }
}
