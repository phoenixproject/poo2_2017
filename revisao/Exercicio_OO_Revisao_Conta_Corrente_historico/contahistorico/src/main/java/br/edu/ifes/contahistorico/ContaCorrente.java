package br.edu.ifes.contahistorico;

public class ContaCorrente extends ContaBancaria {
    
    private Double limiteSaque;

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
    
}
