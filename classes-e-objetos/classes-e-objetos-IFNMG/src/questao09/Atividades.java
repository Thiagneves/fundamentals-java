package questao09;

public class Atividades {
    private String nomeAtivida;
    private String conteudo;
    private int nota;
    private String aluno;
    private int valor;
    private String materia;

    // Metodos ------------------------------------------------

    void exibirDados() {
        System.out.println("---------- " + nomeAtivida + " ----------");
        System.out.println("Aluno: " +this.aluno);
        System.out.println("Matéria: " +this.materia);
        System.out.println("Conteúdo:");
        System.out.println(this.conteudo);
        System.out.println("Valor: " + this.valor + " | Nota: " + this.nota);
        System.out.println(" ");
    }

    // Get e Set ----------------------------------------------

    public String getNomeAtivida() {
        return nomeAtivida;
    }

    public void setNomeAtivida(String nomeAtivida) {
        this.nomeAtivida = nomeAtivida;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
