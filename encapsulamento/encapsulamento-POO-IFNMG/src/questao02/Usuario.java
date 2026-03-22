package questao02;

import java.util.Scanner;

public class Usuario {
    private String nome;
    private String email;
    private String senhaAssinatura;

    void addNovoUsuario(String nome, String email, String senhaAssinatura) {
        setNome(nome);
        setEmail(email);

        Scanner scanner = new Scanner(System.in);

        if (senhaAssinatura == null) {
            System.out.println("Gentileza criar uma senha valida: ");
            this.senhaAssinatura = scanner.nextLine();
        }

        else {
            setSenhaAssinatura(senhaAssinatura);
        }
    }

    void novaSenha(String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senhaAssinatura)) {
            if (this.senhaAssinatura.equals(novaSenha)) {
                System.out.println("Você digitou a mesma senha, gentileza digitar uma senha diferente da atual, para modifica-la");
            }
            else {
                setSenhaAssinatura(novaSenha);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhaAssinatura() {
        return senhaAssinatura;
    }

    public void setSenhaAssinatura(String senhaAssinatura) {
        this.senhaAssinatura = senhaAssinatura;
    }
}
