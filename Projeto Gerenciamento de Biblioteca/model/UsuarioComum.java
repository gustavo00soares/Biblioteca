package model;

public class UsuarioComum extends Usuario {
    public UsuarioComum(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Usuário comum pode apenas emprestar livros.");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Usuário Comum: " + getNome() + " - CPF: " + getCpf());
    }
}