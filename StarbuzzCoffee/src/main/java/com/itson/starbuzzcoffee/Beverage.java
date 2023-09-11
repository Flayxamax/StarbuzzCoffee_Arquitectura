/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcoffee;

/**
 *
 * @author ildex
 */
public abstract class Beverage {

    /**
     *  Descripción de la bebida, esta propiedad puede variar entre diferentes bebidas
     */
    public String description;

    /**
     * Devuelve la descripción de la bebida
     *
     * @return Descripción de la bebida
     */
    public String getDescription() {
        return description;
    }

    /**
     * Calcula el costo de la bebida
     *
     * @return Costo de la bebida
     */
    public abstract double cost();
}
