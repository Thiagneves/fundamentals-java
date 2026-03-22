package atividade1_livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class LivroUI {
    private final Scanner scanner;
    private final LivroService livroService;

    public LivroUI() {
        this.scanner = new Scanner(System.in);
        this.livroService = new LivroService();
    }

    public void iniciar() {
        int opcao;
        do {
            exibirMenu();
            opcao = lerOpcao();
            processarOpcao(opcao);
        } while (opcao != 6);
    }

    public void exibirMenu() {
        System.out.println("\n=== LIVRARIA ===");
        System.out.println("1. Adicionar Livro");
        System.out.println("2. Atualizar Livro");
        System.out.println("3. Remover Livro");
        System.out.println("4. Obter Livro por Codigo de Barras");
        System.out.println("5. Listar Todos os Livros");
        System.out.println("6. Sair");
    }

    public int lerOpcao() {
        System.out.print("Escolha uma opcao: ");
        int opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
    }

    public Livro lerLivro() {
        System.out.print("Codigo de barras: ");
        String codigoDeBarras = scanner.nextLine();

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ano de publicacao: ");
        Integer anoPublicacao = Integer.parseInt(scanner.nextLine());

        System.out.print("Genero: ");
        String genero = scanner.nextLine();

        System.out.print("Preco: ");
        Double preco = Double.parseDouble(scanner.nextLine());

        return new Livro(codigoDeBarras, titulo, autor, anoPublicacao, genero, preco);
    }

    public void exibirLivro(Livro livro) {
        if (livro == null) {
            System.out.println("Livro nao encontrado.");
            return;
        }

        System.out.println(livro);
    }

    public void exibirTodosLivros(ArrayList<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                Livro novoLivro = lerLivro();
                livroService.adicionarLivro(novoLivro);
                System.out.println("Livro adicionado com id " + novoLivro.getId());
                break;
            case 2:
                System.out.print("Id do livro para atualizar: ");
                Integer idAtualizacao = Integer.parseInt(scanner.nextLine());
                Livro livroAtualizado = lerLivro();
                livroAtualizado.setId(idAtualizacao);
                livroService.atualizarLivro(livroAtualizado);
                System.out.println("Livro atualizado com sucesso.");
                break;
            case 3:
                System.out.print("Id do livro para remover: ");
                int idRemocao = Integer.parseInt(scanner.nextLine());
                livroService.removerLivro(idRemocao);
                System.out.println("Livro removido com sucesso.");
                break;
            case 4:
                System.out.print("Codigo de barras: ");
                String codigoDeBarras = scanner.nextLine();
                Livro livro = livroService.obterLivroPorCodigoDeBarras(codigoDeBarras);
                exibirLivro(livro);
                break;
            case 5:
                exibirTodosLivros(livroService.listarTodosLivros());
                break;
            case 6:
                System.out.println("Encerrando sistema.");
                break;
            default:
                System.out.println("Opcao invalida.");
        }
    }
}
