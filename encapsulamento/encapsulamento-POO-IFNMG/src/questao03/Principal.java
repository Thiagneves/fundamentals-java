package questao03;

public class Principal {
    public static void main(String[] args) {
        Usuario user001 = new Usuario();
        Usuario user002 = new Usuario();

        user001.addUsuario("Thiago", "MinhaSenha123");

        user002.addUsuario("Carlos", "Carlos1234");

        ServicoPagamento appPagamento = new ServicoPagamento();

        appPagamento.deposito(user001, "MinhaSenha123", 10000);
        appPagamento.deposito(user002, "Carlos1234", 250);

        appPagamento.realizarPagamento(user002, user001, 100, "Carlos1234");
    }
}
