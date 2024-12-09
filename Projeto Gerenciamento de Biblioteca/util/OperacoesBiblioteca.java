package util;

import model.Livro;

public interface OperacoesBiblioteca {
    void emprestarLivro(String codigoLivro);
    void devolverLivro(String codigoLivro);
    void consultarLivro(String codigoLivro);
}