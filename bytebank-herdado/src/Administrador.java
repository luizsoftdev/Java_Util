public class Administrador extends Funcionario implements Autenticavel{

    @Override
    public double getBonificacao() {
        return 50;
    }

    private AutenticacaoUtil util;
    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }
}
