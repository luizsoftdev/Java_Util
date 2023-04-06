public class TesteReferencias {

    public static void main(String[] args) {

        //Apesar de serem tipos diferentes acessando o tipo ControleBonificacao, podemos passar todos pois Gerente, EditorVideo e Designer são filhos funcionários
        Gerente g2 = new Gerente();
        g2.setNome("Marcelo");
        g2.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g2);
        controle.registra(ev);
        controle.registra(d);

        //Temos duas características principais da herança:
        // Reutilização de código e
        // Polimorfismo(Em que Referências de tipos de classes mais genéricas referenciem objetos mais específicos)

        //System.out.println(controle.getSoma() + " " + g2.getBonificacao() + " " + ev.getBonificacao() + " " + d.getBonificacao());

        System.out.println(controle.getSoma());
    }
}
