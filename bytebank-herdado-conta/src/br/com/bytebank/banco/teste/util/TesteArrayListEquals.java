package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22,22);

        boolean existe = lista.contains(cc3); //O contains faz um laço em cima dos elementos do array e vê se a referência é a mesma

        System.out.println("Já existe?" + existe);

        for(Conta conta : lista){
            System.out.println(conta);

        }

    }

}
