package br.com.bytebank.banco.model;

// A ideia dessa classe é de certa forma contornar algumas desvantagens dos Arrays:
//1-Array não sabe quantas posições estão ocupadas (apenas tamanho total)
//2-Array tem um tamanho fixo (não pode crescer dinamicamente)
//3-Sintaxe fora do padrão "OO Java"
public class GuardadorGenerico {
    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorGenerico(){
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Object ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos(){
        return this.posicaoLivre;
    }

    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
}
