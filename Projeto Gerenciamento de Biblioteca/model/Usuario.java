package model;

public abstract class Usuario extends Pessoa {
    public Usuario(String nome, String cpf) {
        super(nome, cpf);
    }

    public abstract void realizarOperacao();
}