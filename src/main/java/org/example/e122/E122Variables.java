package org.example.e122;

public class E122Variables {
    String countryName;
    String capital;
    int populationSize;

    void display(){
        System.out.println("The capital of " + countryName + " is " + capital
                + " and population is " + populationSize);
    }

    public static void main(String[] args) {
        E122Variables instance1 = new E122Variables();
        instance1.countryName = "USA";
        instance1.capital = "Washington DC";
        instance1.populationSize = 330000000;
        E122Variables instance2 = new E122Variables();
        instance2.countryName = "Kazakhstan";
        instance2.capital = "Astana";
        instance2.populationSize = 18500000;

        instance1.display();
        instance2.display();
    }
}
