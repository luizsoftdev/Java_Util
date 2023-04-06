//Interfaces não podem conter nada concreto,
// logo os métodos setSenha e autentica precisam ser implementados por quem usa essa interface
public abstract interface Autenticavel{

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}
