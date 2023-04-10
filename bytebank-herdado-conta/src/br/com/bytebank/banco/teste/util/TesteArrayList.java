package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        //a) Guarda referências.
        //b) É do pacote java.util
        //c) Usa internamente um array
        //ArrayList lista = new ArrayList();

        //Para evitar tipagem, e gerarmos erros checked, a partir do java 1.5 temos os generics(<>):
        ArrayList<Conta> lista = new ArrayList<>(); // A partir do java 1.7 podemos colocar apenas <> no construtor da classe

        ContaCorrente cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        //Como ContaCorrente é conta, mas a lista é de contas, temos que lançar um cast
        ContaCorrente ref = (ContaCorrente) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33,231);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22,213);
        lista.add(cc4);

        for (int i = 0; i< lista.size();i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("------------");

        for(Object oRef : lista){
            System.out.println(oRef);

        }

        ArrayList lista3 = new ArrayList(26); //capacidade , sobrecarga no arrayList para definir qual seu tamanho inicial, apesar dele continuar dinâmico
        lista3.add("RJ");
        lista3.add("SP");
        //outros estados
        ArrayList nova = new ArrayList(lista3); //criando baseado na primeira lista

    }

}
