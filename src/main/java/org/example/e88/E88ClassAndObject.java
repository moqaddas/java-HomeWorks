package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.name = "Ace";
        dog1.color = "Gray";

        Dog dog2 = new Dog();
        dog2.breed = "Bulldog";
        dog2.name = "Savior";
        dog2.color = "Black";

        Dog dog3 = new Dog();
        dog3.breed = "labrador";
        dog3.name = "Sweet";
        dog3.color = "White";


        dog1.bark();
        dog1.run();
        dog1.play();

        dog2.bark();
        dog2.run();
        dog2.play();

        dog3.bark();
        dog3.run();
        dog3.play();
    }
}
