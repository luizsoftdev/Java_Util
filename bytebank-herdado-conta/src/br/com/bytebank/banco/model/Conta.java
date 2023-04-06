package br.com.bytebank.banco.model;

/**
 * Classe que representa uma conta no ByteBank
 *
 * @author Luiz Fernando
 * @version 1.0
 */
//Podemos mudar os modificadores de visibilidade da classe, dos construtores e dos métodos também

//private (visível apenas na classe)
//<<package private>> (visível na classe E em qualquer outro membro do mesmo pacote, podendo ser chamado de default)
//protected (visível na classe E em qualquer outro membro do mesmo pacote E para qualquer filho)
//public (visível em qualquer pacote)
public abstract class Conta {

    protected double saldo; //protected é visível dentro do pacote e público para os filhos
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser menor ou igual ao saldo
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException{
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <=0){
            System.out.println("O número não pode ter valor negativo ou nulo");
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("A agência não pode ter valor negativo ou nulo");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public String toString() {
        return "Numero: " + this.getNumero() + ", Agencia:" + this.getAgencia();
    }
}