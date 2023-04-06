public class Conta {

    //ATRIBUTOS(OU CAMPOS OU PROPRIEDADES)
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular; //Composição

    //static sinaliza que o atributo é da classe em si
    private static int total;

    //O java só me dá o construtor padrão se eu não tiver criado nenhum
    //Construtor padrão, é uma rotina de inicialização, executado apenas quando o objeto é criado
    public Conta(int agencia, int numero){
        //colocamos Conta.total pois total é um atributo da classe
        Conta.total++;
        System.out.println("O total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta");
    }

    public void deposita(double valor){
        if(valor <= 0){
            System.out.println("O valor não pode ser negativo ou nulo");
            return;
        }
        this.saldo += valor;

    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saca(valor)){
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    //Não é necessário ter um setSaldo() pois já temos funções
    //que deixam desnecessário criar um setter para saldo
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

    //é um método estático pois é um método geral da classe
    //lembrando que não pode usar "this" dentro de um método estático
    //nem nada que referencie this
    public static int getTotal() {
        return Conta.total;
    }
}