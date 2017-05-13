/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.saquecaixa;

/**
 *
 * @author pchan
 */
public interface PagamentoHandler {
    public void setNextHandler(PagamentoHandler pagamentoHandler);
    public void processHandler(int valor);
}
