package questao01;

import java.util.Scanner;

public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidadeEstoque;

    void addProduto(String codigo, String nome, double preco, int quantidade) {

        Scanner scanner = new Scanner(System.in);

        if (codigo == null) {
            System.out.println("Gentileza fornecer um codigo valido (!= null):");
            //CONFERIR
            this.codigo = scanner.nextLine();
        }
        else {
            setCodigo(codigo);
        }

        setNome(nome);

        if (preco <= 0) {
            System.out.println("Gentileza fornecer um preço valido (Maior que 0):");
            //CONFERIR
            this.preco = scanner.nextDouble();
        }

        else {
            setPreco(preco);
        }

        setQuantidadeEstoque(quantidade);
    }

    void addQuantidade (int quantidade) {
        if (quantidade > 0) {
            setQuantidadeEstoque(quantidade);
        }
        else {
            System.out.println("Gentileza utilizar o metodo removerQuantidade");
        }
    }

    void removerQuantidade (int quantidade) {

        if (quantidade > 0) {
            setQuantidadeEstoque(quantidade);
        }

        else {
            System.out.println("Gentileza digitar um quantidade valida!");
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
