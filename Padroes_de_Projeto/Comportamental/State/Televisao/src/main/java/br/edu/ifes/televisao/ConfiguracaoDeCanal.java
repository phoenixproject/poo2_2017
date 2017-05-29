/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.televisao;

/**
 *
 * @author pchan
 */
public class ConfiguracaoDeCanal {
    
    private CanalState canal4;
    private CanalState canal5;
    private CanalState canal6;
    private CanalState canal7;
    
    public ConfiguracaoDeCanal(){
        this.canal4 = new Canal4(this);
        this.canal5 = new Canal5(this);
        this.canal6 = new Canal7(this);
        //this.canal7 = new CAn
                
    }
    
    public void DefinirState(){
        
    }
    
    
    
}
