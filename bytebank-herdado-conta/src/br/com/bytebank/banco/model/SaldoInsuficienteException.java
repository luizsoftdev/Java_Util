package br.com.bytebank.banco.model;

public class SaldoInsuficienteException extends Exception{ //Checked

        public SaldoInsuficienteException(String msg){
            super(msg);
        }
}
