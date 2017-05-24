/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.exerciio_pizza;

/**
 *
 * @author pchan
 */
public class PepperoniPizza implements Pizza {
    
    @Override
    public void bake() {
        System.out.println("Pizza Pepperoni assada. Ah...esses salaminhos!");
    }

    @Override
    public void prepare() {
        System.out.println("Preparando Pepperoni Veggie.");
    }

    @Override
    public void cut() {
        System.out.println("Pizza Pepperoni sendo cortada para o cliente.");
    }

    @Override
    public void box() {
        System.out.println("Pizza Pepperoni embalada e pronta para viagem.");
    }
}
