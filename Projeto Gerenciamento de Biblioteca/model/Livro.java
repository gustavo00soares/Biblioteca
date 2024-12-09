package model;

public class Livro {
    private String titulo;
    private String autor;
    private String codigo;
    private StatusLivro status;

    public Livro(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.status = StatusLivro.DISPONIVEL;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public StatusLivro getStatus() {
        return status;
    }

    public void setStatus(StatusLivro status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", codigo='" + codigo + '\'' +
                ", status=" + status +
                '}';
    }
}