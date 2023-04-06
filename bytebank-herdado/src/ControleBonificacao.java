public class ControleBonificacao {

    private double soma;

    //A vantagem do polimorfismo é poder usar um método genérico como o registra abaixo, pois evitamos repetição de
    // código pois se um tipo filho de funcionario for passado como parâmetro, o método usado será o mais específico do tipo passado como parâmetro
    public void registra(Funcionario f){
        double boni = f.getBonificacao();
        this.soma += boni;
    }
    public double getSoma() {
        return this.soma;
    }
}
