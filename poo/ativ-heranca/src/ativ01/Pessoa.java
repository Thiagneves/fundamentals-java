package ativ01;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        setCpf(cpf);
        this.dataNascimento = dataNascimento;
    }

    private void setCpf(String cpf) {
        if (cpf == null) return;
        this.cpf = cpf;
    }
}
