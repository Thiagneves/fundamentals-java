package questao09;

public class Aluno {
    private String nome;
    private String matricula;

    // Metodos ------------------------------------------------

    void notaAtividade(Atividades nome) {
        nome.exibirDados();
    }

    void enviarAtividade(Atividades atividade, String nomeAtividade, String conteudo) {
        atividade.setAluno(this.nome);
        atividade.setNomeAtivida(nomeAtividade);
        atividade.setConteudo(conteudo);
    }

    void exibirDados () {
        System.out.println("---------- Aluno ----------");
        System.out.println("Nome: " +nome);
        System.out.println("Matricula: " +matricula);
        System.out.println(" ");
    }

    // Get e Set ----------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
