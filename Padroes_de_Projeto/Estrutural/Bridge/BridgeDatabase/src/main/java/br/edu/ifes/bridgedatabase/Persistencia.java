/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.bridgedatabase;

/**
 *
 * @author pchan
 */
public abstract class Persistencia {

    PersistenciaDeDados persistenciaDeDados;
    
    public Persistencia(PersistenciaDeDados persistenciaDeDados){
        this.persistenciaDeDados = persistenciaDeDados;
    }
    
    public void salvar(Object object){};
    
}
