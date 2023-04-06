public class TestaFuncionario {
    public static void main(String[] args) {

        
        Gerente gerente = new Gerente();
        gerente.setNome("Nico Steppot");
        gerente.setCpf("283.819.273-08");
        gerente.setSalario(2600.00);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getBonificacao());
    }
}
