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
public class ClamPizza implements Pizza{
    
    @Override
    public void bake() {
        System.out.println("Pizza de Molusco assadinha.um...!");
    }

    @Override
    public void prepare() {
        System.out.println("Preparando Pizza de Molusco.");
    }

    @Override
    public void cut() {
        System.out.println("Pizza de Molusco sendo cortada para o cliente.");
    }

    @Override
    public void box() {
        System.out.println("Pizza de Molusco embalada e pronta para viagem.");
    }
}
