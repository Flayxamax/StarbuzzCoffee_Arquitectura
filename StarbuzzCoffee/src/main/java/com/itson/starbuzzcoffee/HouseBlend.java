/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcoffee;

/**
 *
 * @author ildex
 */
public class HouseBlend extends Beverage {

    /**
     * Constructor que crea un nuevo objeto de la bebida con una descripción
     * definida
     */
    public HouseBlend() {
        description = "HouseBlend";
    }

    /**
     * Calcula el costo de la bebida
     *
     * @return Costo de la bebida
     */
    @Override
    public double cost() {
        return 38.0;
    }

}
