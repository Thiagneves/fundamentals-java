package questao01;

public class GerenciadorEstoque {
    public void atualizarEstoque(Produto produto, int quantidade) {

        if (quantidade <= produto.getQuantidadeEstoque()) {

            produto.setQuantidadeEstoque(quantidade);
        }
    }
}