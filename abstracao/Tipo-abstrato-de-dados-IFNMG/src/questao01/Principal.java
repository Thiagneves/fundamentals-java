package questao01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Aluno aluno1 = new Aluno();

        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o nome do aluno: ");
        aluno1.alunomatriculado = sc.nextLine();

        System.out.print("Digite a matrícula: ");
        aluno1.matricula = sc.nextLine();

        System.out.print("Digite a nota da primeira prova: ");
        float prova1 = sc.nextFloat();

        System.out.print("Digite a nota da segunda prova: ");
        float prova2 = sc.nextFloat();

        System.out.print("Digite a nota da terceira prova: ");
        float prova3 = sc.nextFloat();

        System.out.print("Digite a nota do trabalho: ");
        float trabalho = sc.nextFloat();

        aluno1.imprimirdados(aluno1.alunomatriculado, aluno1.matricula);
        aluno1.imprimirmedia(prova1, prova2, prova3, trabalho);

        sc.close();

    }
}
