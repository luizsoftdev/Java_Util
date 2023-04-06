package br.com.bytebank.banco.model;

/**
 * Classe que representa um cliente no ByteBank
 *
 * @author Luiz Fernando
 * @version 1.0
 */
public class Cliente {
    private String cpf;

    private String nome;

    private String profissao;

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


}
