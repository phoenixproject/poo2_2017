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
public class Pagamento50Handler  extends AbstractPagamentoHandler{

    @Override
    protected int matchinValue() {
        return 50;
    }

    @Override
    protected void handleHere(int numerocedulas) {
        System.out.println(numerocedulas + " Cédula(s) de 50 reais sacada(s)");
    }
}
