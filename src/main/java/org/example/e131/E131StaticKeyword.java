package org.example.e131;

public class E131StaticKeyword {
    public static String thirdLetter(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i += 3) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "hello there";
        String input2 = "technology";
        System.out.println(thirdLetter(input1));
        System.out.println(thirdLetter(input2));
    }
}
