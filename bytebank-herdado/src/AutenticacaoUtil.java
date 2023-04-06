//AutenticacaoUtil é uma composição com o gerente, o administrador e o cliente. A composição é uma forma de contornar apenas a reutilização de código
public class AutenticacaoUtil {

    private int senha;
    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}
