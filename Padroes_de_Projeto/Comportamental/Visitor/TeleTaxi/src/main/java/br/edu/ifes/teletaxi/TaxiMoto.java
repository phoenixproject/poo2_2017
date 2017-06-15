
package br.edu.ifes.teletaxi;

public class TaxiMoto extends Taxi{
    @Override
    public void parar() {  
       System.out.println("Apertar o freio");
    }
    @Override
    public void andarParaFrente() {        
        System.out.println("Acelerar");        
    }
    @Override
    public void virarEsquerda() {        
        System.out.println("Dar a seta");
        System.out.println("Virar guidão para direira");
    }
    @Override
    public void virarDireita() {
        System.out.println("Dar a seta");
        System.out.println("Virar guidão para direira");
    }
    @Override
    public void andarParaTras() {
        System.out.println("Nada a fazer");        
    }
    
}
