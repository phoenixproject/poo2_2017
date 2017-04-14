/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.adaptersms.clientes1;

/**
 *
 * @author pchan
 */
public class AdapterToS1 extends ClienteS1{
    ClienteS2 c2;
    
    public AdapterToS1(ClienteS2 clientes2){
        c2 = clientes2;
    }
    
    @Override
    public String getNomeCompleto(){
        return c2.getNome() + " " + c2.getSobreNome();
    }
    
}
