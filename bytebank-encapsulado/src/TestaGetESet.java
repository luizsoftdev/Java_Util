public class TestaGetESet{
    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);

        //a linha abaixo não funciona pois número agora é um atributo privado
        //pois não queremos mais trabalhar com atribuições
        //conta.numero = 1337

        //conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        //conta.titular = paulo;"
        paulo.setNome("Paulo Silveira");

        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        //em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("engenheiro");
        System.out.println(titularDaConta.getProfissao());

        //tem a mesma chave:
        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());
    }
}
