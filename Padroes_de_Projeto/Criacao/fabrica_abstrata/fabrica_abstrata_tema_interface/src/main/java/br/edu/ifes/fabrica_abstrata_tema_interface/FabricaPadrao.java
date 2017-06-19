/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.fabrica_abstrata_tema_interface;

import javax.swing.JButton;

/**
 *
 * @author pchan
 */
public class FabricaPadrao extends FabricaAbstrataBotoes {

    @Override
    public JButton criaBotaoOK() {
        
        JButton ok;
        ok = new JButton();
        ok.setText("OK");
        
        return ok;
    }

    @Override
    public JButton criaBotaoCancel() {
        
        JButton cancel;
        cancel = new JButton();   
        cancel.setText("Cancelar");
        
        return cancel;
    }

}
