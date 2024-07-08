package org.example.e14;

public class E14PizzaPartyModulus {
    public static void main(String[] args) {
    int totalSlices=13;
    int friends=4;
    int slicesPerPerson=totalSlices/friends;
    int leftoverSlices=totalSlices%friends;
    System.out.println("Each person gets " +  slicesPerPerson +  " slices ");
    System.out.println("There are " + leftoverSlices + " slices" +" left over" );
    }
}
