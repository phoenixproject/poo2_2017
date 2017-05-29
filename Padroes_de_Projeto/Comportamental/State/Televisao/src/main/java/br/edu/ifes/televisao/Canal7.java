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
public class Canal7 implements CanalState {

    private ConfiguracaoDeCanal configuracaoDeCanal;
    
    public Canal7(ConfiguracaoDeCanal configuracaoDeCanal){
        this.configuracaoDeCanal = configuracaoDeCanal;                
    }
    
    @Override
    public void SelecionarCanal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ObterInformacoesDoCanal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ObterCanalSelecionado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
