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
public class SalvaCliente {
    
    public void salva(ClienteS1 cliente){
    
        System.out.println("Salvando o cliente...");
        System.out.println(cliente.getNomeCompleto());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.getEmail());
        System.out.println(cliente.getCelular());
        
    }
}
