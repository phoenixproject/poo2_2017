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
public class PizzaStore {
    
    public static void main(String args[]){
        
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza;
        
        pizza = pizzaFactory.createPizza("clam");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        pizza = pizzaFactory.createPizza("pepperoni");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        pizza = pizzaFactory.createPizza("veggie");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        pizza = pizzaFactory.createPizza("chesse");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();        
        
    }
    
}
