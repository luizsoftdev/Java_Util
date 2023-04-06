public class TesteGerente {
    public static void main(String[] args) {

        Autenticavel referencia = new Cliente();

        Gerente g1 = new Gerente();
        g1.setNome("Luiz Fernando");
        g1.setCpf("289.372.193-81");
        g1.setSalario(3500.00);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        System.out.println(g1.autentica(2222));

        System.out.println(g1.getBonificacao());
    }
}
