package org.example.e94;

public class E94StringManipulations {
    public static void main(String[] args) {
        String given = "I love Java classes at Syntax";
        String part1 = given.substring(12, 29);
        System.out.println(part1);
        String part2 = given.substring(0, 11);
        System.out.println(part2);
    }
}
