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
public class Main {
    
    //public static void handle(int valor){
    public static void main(String args[]){
        
        int valor = 385;
        
        //Create handler objects
        PagamentoHandler p100 = new Pagamento100Handler();
        PagamentoHandler p50 = new Pagamento50Handler();
        PagamentoHandler p20 = new Pagamento20Handler();
        PagamentoHandler p10 = new Pagamento10Handler();
        PagamentoHandler p5 = new Pagamento5Handler();
        PagamentoHandler p2 = new Pagamento2Handler();
        PagamentoHandler p1 = new Pagamento1Handler();
        
        //Chain the together
        p100.setNextHandler(p50);
        p50.setNextHandler(p20);
        p20.setNextHandler(p10);
        p10.setNextHandler(p5);
        p5.setNextHandler(p2);
        p2.setNextHandler(p1);
        
        //Start the ball rolling
        p100.processHandler(valor);
        
    }
    
}
