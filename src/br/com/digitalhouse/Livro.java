package br.com.digitalhouse;

public class Livro {
    private String codigo;
    private String titulo;
    private String autor;
    private int lancamento;
    private double estoque;
    private String ISBN;

    public Livro(String codigo, String titulo, String autor, int lancamento, double estoque, String ISBN) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.lancamento = lancamento;
        this.estoque = estoque;
        this.ISBN = ISBN;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getLancamento() {
        return lancamento;
    }

    public double getEstoque() {
        return estoque;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
