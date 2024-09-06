package org.example.e120;

public class E120Variables {
    int year;
    String schoolName;
    int batchNumber;

    public void main(String[] args) {
        E120Variables student = new E120Variables();

        student.year = 2020;
        student.schoolName = "Syntax";
        student.batchNumber = 6;
        System.out.println("I am a student of batch " + student.batchNumber +
                " stuying at " + student.schoolName + " in the year of " + student.year);
    }
}
