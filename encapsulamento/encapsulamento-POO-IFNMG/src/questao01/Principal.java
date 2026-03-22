package questao01;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.addProduto("JO01", "Caneta", -1.5, 10);

        Venda venda = new Venda();
        venda.realizarVenda(produto, 2);

        GerenciadorEstoque gerenciador = new GerenciadorEstoque();
        gerenciador.atualizarEstoque(produto, 3);
    }
}
