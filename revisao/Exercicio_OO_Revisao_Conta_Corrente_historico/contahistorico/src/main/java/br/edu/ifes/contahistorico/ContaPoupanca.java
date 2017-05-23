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
public class ContaPoupanca extends ContaBancaria {
    
    private Date dataAniversario;
    private Double rendimento;

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public Double getRendimento() {
        return rendimento;
    }

    public void setRendimento(Double rendimento) {
        this.rendimento = rendimento;
    }
    
}
