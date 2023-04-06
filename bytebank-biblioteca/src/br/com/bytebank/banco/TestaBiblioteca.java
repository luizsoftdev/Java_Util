package br.com.bytebank.br.com.bytebank.banco;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TestaBiblioteca {

    public static void main(String[] args) {
        Conta c = new ContaCorrente(123, 321);
    }
}