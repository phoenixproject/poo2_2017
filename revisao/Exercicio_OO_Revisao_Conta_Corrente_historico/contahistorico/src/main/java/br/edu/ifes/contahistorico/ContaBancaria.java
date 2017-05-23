/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.contahistorico;

import java.util.Date;

/**
 *
 * @author pchan
 */
public class ContaBancaria {
    
    private int numero;
    private Date dataAbertura;
    private Double saldo;
    private HistoricoTransacao historicoTransacao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void debitar(Double valor){
        this.saldo = this.saldo - valor;        
    }
    
    public void creditar(Double valor){
        this.saldo = this.saldo + valor;
    }    
    
}
