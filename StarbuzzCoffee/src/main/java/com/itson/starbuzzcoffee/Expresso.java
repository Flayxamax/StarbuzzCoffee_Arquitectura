/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcoffee;

/**
 *
 * @author ildex
 */
public class Expresso extends Beverage {

    /**
     * Constructor que crea un nuevo objeto de la bebida con una descripción
     * definida
     */
    public Expresso() {
        description = "Expresso";
    }

    /**
     * Calcula el costo de la bebida
     *
     * @return Costo de la bebida
     */
    @Override
    public double cost() {
        return 36.0;
    }

}
