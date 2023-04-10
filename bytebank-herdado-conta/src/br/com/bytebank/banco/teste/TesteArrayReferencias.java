package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {
        Object[] referencias = new Object[5];//Inicializa com o valor null

        System.out.println(referencias.length);
        ContaCorrente cc1 = new ContaCorrente(22,11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22,22);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        //Printam as mesma coisa, pois temos 3 referências apontando para o mesmo objeto, cc2, referencias[1]
        //System.out.println(cc2.getNumero());
        //System.out.println(referencias[1].getNumero());
        
        //Object referenciaGenerica = referencias[1];
        //System.out.println( referenciaGenerica.getNumero() );

        int numero = 3;
        double valor = (double) numero; //cast explícito

        double valor2 = 3.56;
        int numero2 = (int) valor; //cast explicito é exigido pelo compilador

        //Cliente cliente2 = new Cliente();
        //Conta conta = (Conta) cliente2; //impossível, não compila
        

        //Fazendo "cast na referência para transformar a referência para
        //apontar para umas mais específica
        ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
        //ContaCorrente ref2 = (ContaCorrente) referencias[1]; // ClassCastException
        System.out.println(ref.getNumero());
    }
}
