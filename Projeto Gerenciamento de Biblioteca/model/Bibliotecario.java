package model;

public class Bibliotecario extends Usuario {
    public Bibliotecario(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Bibliotecário pode gerenciar livros e usuários.");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Bibliotecário: " + getNome() + " - CPF: " + getCpf());
    }
}