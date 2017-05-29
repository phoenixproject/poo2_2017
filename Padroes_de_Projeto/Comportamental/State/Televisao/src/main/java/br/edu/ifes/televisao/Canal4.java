package br.edu.ifes.televisao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pchan
 */
public class Canal4 implements CanalState {
 
    private ConfiguracaoDeCanal configuracaoDeCanal;
    
    public Canal4(ConfiguracaoDeCanal configuracaoDeCanal){
        this.configuracaoDeCanal = configuracaoDeCanal;                
    }

    @Override
    public void SelecionarCanal() {
        System.out.println("Canal 4 selecionado");
        this.configuracaoDeCanal.DefinirState();
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
