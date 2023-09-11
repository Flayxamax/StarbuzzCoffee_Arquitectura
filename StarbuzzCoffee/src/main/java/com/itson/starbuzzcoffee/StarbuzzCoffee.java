/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.itson.starbuzzcoffee;

/**
 *
 * @author ildex
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage coffeeHB = new HouseBlend();
        System.out.println("Coffee: " + coffeeHB.getDescription() + "\n"
                + "Costo de la bebida: $" + coffeeHB.cost());
        
        System.out.println("");
        
        Beverage coffeeDR = new DarkRoast();
        coffeeDR = new Milk(coffeeDR);
        System.out.println("Coffee: " + coffeeDR.getDescription() + "\n"
                + "Costo de la bebida: $" + coffeeDR.cost());
        
        System.out.println("");
        
        Beverage coffeeE = new Expresso();
        coffeeE = new Chocolate(coffeeE);
        coffeeE = new Milk(coffeeE);
        System.out.println("Coffee: " + coffeeE.getDescription() + "\n"
                + "Costo de la bebida: $" + coffeeE.cost());
        
        System.out.println("");
        
        Beverage coffeeD = new Decaf();
        coffeeD = new Soy(coffeeD);
        coffeeD = new Milk(coffeeD);
        coffeeD = new WhippedCream(coffeeD);
        System.out.println("Coffee: " + coffeeD.getDescription() + "\n"
                + "Costo de la bebida: $" + coffeeD.cost());
    }
}
