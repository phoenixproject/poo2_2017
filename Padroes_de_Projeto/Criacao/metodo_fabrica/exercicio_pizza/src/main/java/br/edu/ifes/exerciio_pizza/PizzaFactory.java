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
public class PizzaFactory {
    
    public static Pizza createPizza(String tipoPizza){
     
        Pizza pizza;
        
        switch (tipoPizza){
            
            case "pepperoni" :
                
                pizza = new PepperoniPizza();
                break;
                
            case "chesse" :
                
                pizza = new ChessePizza();
                break;
                
            case "clam" :
                
                pizza = new ClamPizza();
                break;
            
            case "veggie" :
                
                pizza = new VeggiePizza();
                break;

            default:
                
                pizza = null;
                break;
            
        }
        
        return pizza;
    }
}
