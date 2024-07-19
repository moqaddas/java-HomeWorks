package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name of the instructor");
        String instructorName=scanner.nextLine();
        String responsibility;
        switch (instructorName){
            case "Asghar":
                responsibility="Will take care of Java Assignment";
                break;
            case "Moazzam":
                responsibility="Will take of SDLC Assignment";
                break;
            case "Weqas":
                responsibility="Will take care of Selenium Assignment";
                break;
            case "Asel":
                responsibility="Will take care of every Assignment";
                break;
            default:
                responsibility="Invalid instructor selected";
        }
        System.out.println(responsibility);
        scanner.close();
    }
}
