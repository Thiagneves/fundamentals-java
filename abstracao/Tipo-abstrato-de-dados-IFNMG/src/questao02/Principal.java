package questao02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Livro livro1 = new Livro();
        Autor escritor = new Autor();
        Editora editora1 = new Editora();

        System.out.println("Escreva o titulo do livro: ");
        livro1.titulo = sc.nextLine();

        System.out.println("Escreva a quantidade de paginas do livro: ");
        livro1.quantidadepaginas = sc.nextInt();

        System.out.println("Qual o ano da publicação do livro: ");
        livro1.anopublicacao = sc.nextInt();
        sc.nextLine(); //para não dar erro e pular o proximo.

        System.out.println("Qual o nome da editora do livro: ");
        livro1.editora = sc.nextLine();

        System.out.println("Qual o nome do autor do livro: ");
        livro1.autor = sc.nextLine();

        livro1.imprimirdetalhes(livro1.titulo, livro1.anopublicacao, livro1.autor, livro1.editora);

        //Questão 03

        escritor.nome = livro1.autor;

        System.out.println("Qual a data de nascimento do autor: ");
        escritor.datanascimento = sc.nextLine();

        editora1.nome = livro1.editora;

        System.out.println("Qual o CNPJ da editora: ");
        editora1.cnpj = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual o endereço da editora: ");
        editora1.endereco = sc.nextLine();

        sc.close();
    }
}
