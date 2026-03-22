package questao09;

public class Professor {
    private String nome;
    private String materia;

    // Metodos ------------------------------------------------

    void addNota(Atividades atividade, int valor, int nota) {
        atividade.setMateria(this.materia);
        atividade.setValor(valor);
        atividade.setNota(nota);
    }

    void exibirDados() {
        System.out.println("---------- Professor(a) ----------");
        System.out.println("Nome: " +nome);
        System.out.println("Matéria: " +materia);
        System.out.println(" ");
    }

    // Get e Set ----------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
