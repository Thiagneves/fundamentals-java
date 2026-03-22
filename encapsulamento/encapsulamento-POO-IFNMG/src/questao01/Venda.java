package questao01;

public class Venda {
    public void realizarVenda(Produto produto, int quantidade) {

        if (quantidade <= produto.getQuantidadeEstoque()) {

            produto.setQuantidadeEstoque(quantidade);
        }
    }
}
