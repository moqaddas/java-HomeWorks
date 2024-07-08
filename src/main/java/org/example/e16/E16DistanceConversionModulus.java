package org.example.e16;

public class E16DistanceConversionModulus {
    public static void main(String[] args) {
        int totalMeters=1850;
        int kiloMeters=totalMeters/1000;
        int meters=totalMeters%1000;
        System.out.println(totalMeters+" meters is equal to " +kiloMeters+" kilometers and "+meters+" meters.");
    }
}
