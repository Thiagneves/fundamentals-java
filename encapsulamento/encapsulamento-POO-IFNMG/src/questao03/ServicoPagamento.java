package questao03;

public class ServicoPagamento {
    public void realizarPagamento(Usuario pagador, Usuario recebedor, double valor, String senhaDigitada) {
        if (senhaDigitada.equals(pagador.getSenhaPagamento())) {
            if (pagador.getSaldo() >= valor) {
                pagador.setSaldo(pagador.getSaldo() - valor);
                recebedor.setSaldo(recebedor.getSaldo() + valor);
            }

            else {
                System.out.println("Usuario sem saldo!");
            }
        }
    }

    void deposito(Usuario usuario, String senhaDigitada, double valor) {
        if (senhaDigitada.equals(usuario.getSenhaPagamento())) {
            usuario.setSaldo(usuario.getSaldo() + valor);
            return;
        }
        else {
            System.out.println("Senha invalida");
        }
    }

    void saque(Usuario usuario, String senhaDigitada, double valor) {
        if (senhaDigitada.equals(usuario.getSenhaPagamento())) {
            if (usuario.getSaldo() >= valor) {
                usuario.setSaldo(usuario.getSaldo() - valor);
                return;
            }
            else {
                System.out.println("Saldo insuficiente!");
                return;
            }
        }
        else {
            System.out.println("Senha invalida");
        }
    }
}
