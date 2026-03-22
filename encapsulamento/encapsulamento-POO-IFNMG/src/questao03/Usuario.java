package questao03;

public class Usuario {
    private String nome;
    private String senhaPagamento;
    private double saldo;

    void addUsuario (String nome, String senha){
        if (nome == null) {
            System.out.println("Nome invalido!");
            return;
        }

        else if (senha == null) {
            System.out.println("Senha invalida!");
            return;
        }

        else {
            setNome(nome);
            setSenhaPagamento(senha);
        }
    }

    void novaSenha(String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(getSenhaPagamento())) {
            if (getSenhaPagamento().equals(novaSenha)) {
                System.out.println("Você digitou a mesma senha, gentileza digitar uma senha diferente da atual, para modifica-la");
            }
            else {
                setSenhaPagamento(novaSenha);
            }
        }
        else {
            System.out.println("A senha atual não confere com a senha digitada");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenhaPagamento() {
        return senhaPagamento;
    }

    public void setSenhaPagamento(String senhaPagamento) {
        this.senhaPagamento = senhaPagamento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
