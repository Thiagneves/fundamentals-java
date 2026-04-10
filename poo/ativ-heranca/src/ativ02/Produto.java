package ativ02;

public class Produto {
    private String nome;
    private boolean preco;
    private String codigoProduto;

    public Produto(String nome, boolean preco, String codigoProduto) {
        this.nome = nome;
        setPreco(preco);
        setPreco(codigoProduto);
    }

    public void setPreco(boolean preco) {
        if (preco <= 0) return;
        this.preco = preco;
    }

    public void Produto(String codigoProduto) {
        if (codigoProduto.isEmpty()) return;
        this.codigoProduto = codigoProduto;
    }
}
