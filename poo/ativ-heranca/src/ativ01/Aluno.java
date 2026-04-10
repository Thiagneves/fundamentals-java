package ativ01;

public class Aluno extends Pessoa{
    private String matriculaAluno;
    private String serie;

    public Aluno(String nome, String cpf, String dataNascimento, String matriculaAluno, String serie) {
        super(nome, cpf, dataNascimento);
        setMatriculaAluno(matriculaAluno);
        this.serie = serie;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        if (matriculaAluno.isEmpty()) return;
        this.matriculaAluno = matriculaAluno;
    }
}
