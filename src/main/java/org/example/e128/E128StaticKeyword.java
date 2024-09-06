package org.example.e128;

public class E128StaticKeyword {
        public static String mixString(String s1, String s2) {
            String mix = "";
            for (int i = 0; i < s1.length(); i++) {
                mix += s1.charAt(i);
                mix += s2.charAt(i);
            }
            return mix;
        }

        public static void main(String[] args) {
            String result = mixString("12345", "abcde");
            System.out.println(result);
        }
    }