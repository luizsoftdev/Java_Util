public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);

        //conta.setAgencia(-50);
        //conta.setNumero(0);

        //conta.getAgencia() possuirá valor nulo se usarmos o construtor padrão pois será criada de forma inconsistente
        System.out.println(conta.getAgencia());

        //O atributo é imutável se após nascer o valor dele não precise ser alterado
        //é um caso em que o set dele não precisa ser implementado na Classe
        //conta.setAgencia(13375)

        Conta contaTesteTotal = new Conta(1234,12983);
        Conta contaTesteTotal3 = new Conta(1239,58122);

        //se eu colocasse conta2.getTotal() funcionaria, mas como total é da classe
        //faz mais sentido usar Conta.getTotal().
        System.out.println("O total de contas é: " + Conta.getTotal());

    }
}
