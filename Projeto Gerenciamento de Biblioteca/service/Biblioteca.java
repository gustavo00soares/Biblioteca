package service;

import model.Livro;
import model.StatusLivro;
import util.OperacoesBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements OperacoesBiblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void listarLivros() {
        livros.forEach(System.out::println);
    }

    @Override
    public void emprestarLivro(String codigoLivro) {
        Livro livro = buscarLivro(codigoLivro);
        if (livro != null && livro.getStatus() == StatusLivro.DISPONIVEL) {
            livro.setStatus(StatusLivro.EMPRESTADO);
            System.out.println("Livro emprestado: " + livro.getTitulo());
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    @Override
    public void devolverLivro(String codigoLivro) {
        Livro livro = buscarLivro(codigoLivro);
        if (livro != null && livro.getStatus() == StatusLivro.EMPRESTADO) {
            livro.setStatus(StatusLivro.DISPONIVEL);
            System.out.println("Livro devolvido: " + livro.getTitulo());
        } else {
            System.out.println("Erro na devolução do livro.");
        }
    }

    @Override
    public void consultarLivro(String codigoLivro) {
        Livro livro = buscarLivro(codigoLivro);
        if (livro != null) {
            System.out.println(livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    private Livro buscarLivro(String codigo) {
        return livros.stream()
                .filter(livro -> livro.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }
}