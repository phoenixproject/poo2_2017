/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.fabrica_abstrata_telefonia;

/**
 *
 * @author pchan
 */
public class FabricaClaro extends FabricaAbstrataEnvios {
    
    @Override
    public Cobranca criaCobranca() {
        return new CobrancaClaro();
    }
    @Override
    public EnvioSMS criaEnvioSMS() {
        return new EnvioSMSClaro(); 
    }
    
}
