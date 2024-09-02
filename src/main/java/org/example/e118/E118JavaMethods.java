package org.example.e118;

public class E118JavaMethods {

    public static String spaceOut(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            result.append(c).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("spaceOut(\"hello\") ==> \"" + spaceOut("hello") + "\"");
        System.out.println("spaceOut(\"technology\") ==> \"" + spaceOut("technology") + "\"");
    }
}