package main;

import model.Bibliotecario;
import model.Livro;
import model.UsuarioComum;
import service.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "001");
        Livro livro2 = new Livro("1984", "George Orwell", "002");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        UsuarioComum usuario = new UsuarioComum("João", "123456789");
        Bibliotecario bibliotecario = new Bibliotecario("Ana", "987654321");

        biblioteca.listarLivros();
        biblioteca.emprestarLivro("001");
        biblioteca.consultarLivro("001");
        biblioteca.devolverLivro("001");

        usuario.mostrarInformacoes();
        bibliotecario.mostrarInformacoes();
    }
}