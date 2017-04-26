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
public class ImplementacaoPersistencia extends Persistencia {

    public ImplementacaoPersistencia(PersistenciaDeDados persistenciaDeDados) {
        super(persistenciaDeDados);
    }
    
    @Override    
    public void salvar(Object object){
        //System.out.println("Salvando objeto...");
        this.persistenciaDeDados.salvar(object);
    }
}
