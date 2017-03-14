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
public abstract class FabricaAbstrataEnvios {        
    public abstract Cobranca criaCobranca();
    public abstract EnvioSMS criaEnvioSMS();
}
