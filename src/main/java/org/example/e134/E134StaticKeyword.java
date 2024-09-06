package org.example.e134;

public class E134StaticKeyword {
    public static int countVowels(String s) {
        int count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("obama"));
        System.out.println(countVowels("happy friday i love weekends"));
    }
}

