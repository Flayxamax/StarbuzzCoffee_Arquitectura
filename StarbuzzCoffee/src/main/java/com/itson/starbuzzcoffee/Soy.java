/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcoffee;

/**
 *
 * @author ildex
 */
public class Soy extends CondimentDecorator {

    /**
     * Costo adicional por agregar el condimento de soya a la bebida
     */
    private final double condimentCost = 10.0;

    /**
     * Constructor que crea un nuevo objeto para una bebida
     *
     * @param beverage Bebida a la que se le agregará el condimento
     */
    public Soy(Beverage beverage) {
        this.wrappee = beverage;
    }

    /**
     * Obtiene la descripción de la bebida con el condimento
     *
     * @return Descripción de la bebida con la adición del condimento
     */
    @Override
    public String getDescription() {
        return wrappee.getDescription() + "\n|Soy|";
    }

    /**
     * Calcula el costo total de la bebida incluyendo el costo del condimento
     * agregado.
     *
     * @return El costo total de la bebida con el condimento.
     */
    @Override
    public double cost() {
        return wrappee.cost() + condimentCost;
    }

}
