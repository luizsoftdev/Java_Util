
//não pode instanciar dessa classe pq é abstrata
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario; //o ideal sempre é ser private


    public abstract double getBonificacao();
    //abstract no método, mostra que ele não há implementação, o
    //método não tem corpo, logo os filhos devem implementar esse método
    //só posso colocar métodos abstratos se a classe for abstrata


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
