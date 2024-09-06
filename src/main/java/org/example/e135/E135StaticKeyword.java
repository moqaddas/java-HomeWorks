package org.example.e135;

public class E135StaticKeyword {
    static String surround(String s, String search_term) {
        return s.replaceAll(search_term, "(" + search_term + ")");
    }

    public static void main(String[] args) {
        System.out.println(surround("abcabcabc", "c"));
        System.out.println(surround("technology", "o"));
    }
}
