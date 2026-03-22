package atividade03_clinica;

public class Paciente {
    private Integer id;
    private String nome;
    private String cpf;
    private String telefone;
    private boolean ativarAtendimento = false;

    public Paciente(String nome, String cpf, String telefone) {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
    }

    public void ativarAtendimento() {
        setAtivarAtendimento(true);
    }

    public void desativarAtendimento() {
        setAtivarAtendimento(false);
    }

    public void atualizarTelefone(String telefone) {
        setTelefone(telefone);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAtivarAtendimento() {
        return ativarAtendimento;
    }

    public void setAtivarAtendimento(boolean ativoAtendimento) {
        this.ativarAtendimento = ativoAtendimento;
    }
}
