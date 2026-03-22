package questao01;

public class Aluno {
    public String alunomatriculado;
    public String matricula;
    public float prova;
    public float trabalho;
    public float calculomedia;

    void imprimirdados(String nome, String idaluno){
        System.out.println("Aluno: " +nome+ " ");
        System.out.print("Matricula: " +idaluno);
    }

    void imprimirmedia(float prova1, float prova2, float prova3, float trabalho){

        calculomedia = (float) (((prova1*2) + (prova2*2) + (prova3*2) + (trabalho*1.5))/7.5);
        System.out.printf("\nMedia: %.2f", calculomedia);
        if (calculomedia >= 6){
            System.out.println("\nAluno Aprovado!");
        }
        else {
            System.out.println("\nAluno Reprovado!");
        }


    }
}
