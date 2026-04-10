package ativ02;

public class Eletronico extends Produto{
    private String fabricante;
    private int voltagem;

    public Eletronico(String nome, boolean preco, String codigoProduto, String fabricante, int voltagem) {
        super(nome, preco, codigoProduto);
        this.fabricante = fabricante;
        this.voltagem = voltagem;
    }

    public void setVoltagem(int voltagem) {
        if (voltagem != 110 || voltagem != 220) return;
        this.voltagem = voltagem;
    }
}
