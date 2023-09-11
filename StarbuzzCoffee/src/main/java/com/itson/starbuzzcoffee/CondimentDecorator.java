/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcoffee;

/**
 *
 * @author ildex
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     *  Bebida que se le agregarán condimentos adicionales
     */
    public Beverage wrappee;

    /**
     * Devuelve la descripción de la bebida con condimentos adicionales
     *
     * @return Descripción de la bebida con los condimentos adicionales.
     */
    @Override
    public abstract String getDescription();

}
