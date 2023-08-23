package DesignPattern.Bridge;

import DesignPattern.Bridge.abstractions.AmericanRestaurant;
import DesignPattern.Bridge.abstractions.ItalianRestaurant;
import DesignPattern.Bridge.abstractions.Restaurant;
import DesignPattern.Bridge.implementations.PepperoniPizza;
import DesignPattern.Bridge.implementations.VeggiePizza;
public class Main {
    public static void main(String[] args) {

        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }
}
