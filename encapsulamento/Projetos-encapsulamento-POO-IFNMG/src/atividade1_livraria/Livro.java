package atividade1_livraria;

public class Livro {
    private Integer id;
    private String codigoDeBarras;
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private String genero;
    private Double preco;

    public Livro(String codigoDeBarras, String titulo, String autor, Integer anoPublicacao, String genero, Double preco) {
        this.codigoDeBarras = codigoDeBarras;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", codigoDeBarras='" + codigoDeBarras + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", genero='" + genero + '\'' +
                ", preco=" + preco +
                '}';
    }
}
