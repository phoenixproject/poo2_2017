/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.exercicio_shapes;

/**
 *
 * @author pchan
 */
public class ShapeFactory {
    
    public Shape getShape(String shapeType){
        
        Shape shape = null;
        
        switch(shapeType){
            
            case "Square":
                shape = new Square();
                break;
            case "Triangle":
                shape = new Triangle();
                break;
            case "Circle":
                shape = new Circle();
                break;            
        }
        
        return shape;
    }
    
}
