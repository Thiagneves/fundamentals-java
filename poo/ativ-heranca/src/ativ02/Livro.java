package ativ02;

public class Livro extends Produto {
    private String autor;
    private int numeroPaginas;

    public Livro(String nome, boolean preco, String codigoProduto, String autor, int numeroPaginas) {
        super(nome, preco, codigoProduto);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas < 10) return;
        this.numeroPaginas = numeroPaginas;
    }
}
