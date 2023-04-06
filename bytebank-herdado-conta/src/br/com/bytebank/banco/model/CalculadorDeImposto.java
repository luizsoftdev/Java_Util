package br.com.bytebank.banco.model;


//Full Qualified Name(FQN): br.com.bytebank.model.CalculadorDeImposto
public class CalculadorDeImposto {

    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto(){
        return this.totalImposto;
    }

}
