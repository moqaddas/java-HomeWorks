package org.example.e133;

public class E133StaticKeyword {
    public static int countA (String s){
        int counter=0;
        for (int i = 0; i <s.length() ; i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c =='a'){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
            System.out.println(countA("aaa"));
            System.out.println(countA("aaBBdf8k3AAadnklA"));
        }
    }

