/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.saquecaixa;

/**
 *
 * @author pchan
 */
public abstract class AbstractPagamentoHandler implements PagamentoHandler{
    
    private PagamentoHandler nextHandler;
        
    public void setNextHandler(PagamentoHandler handler){
        nextHandler = handler;
    }
    
    public void processHandler(int valor){
        
        boolean valueFound = false;
        int numerocedulas = 0;
        
        numerocedulas = (int) (valor / matchinValue());
        
        //Se o valor a ser retirado for zero, ele pode ser manipulado
        if(matchinValue() == valor){
            valor = valor - matchinValue();
            valueFound = true;
        }
        else{
            if(valor >= matchinValue()){            
                valor = valor - matchinValue() * numerocedulas;
                valueFound = true;                
            }        
        }
        //
        if(valueFound){
            
            if(numerocedulas > 0){                            
                handleHere(numerocedulas);
                processHandler(valor);            
            }
            
        }
        else{
            if(nextHandler != null) {
                nextHandler.processHandler(valor);                           
            }            
        }            

    }
    
    protected abstract int matchinValue();
    protected abstract void handleHere(int numerocedulas);
            
}
