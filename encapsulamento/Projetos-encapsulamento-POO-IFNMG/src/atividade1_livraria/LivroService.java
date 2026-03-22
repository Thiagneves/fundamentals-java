package atividade1_livraria;

import java.util.ArrayList;

public class LivroService {
    private final LivroDAO livroDAO;

    public LivroService() {
        this.livroDAO = new LivroDAO();
    }

    public Livro adicionarLivro(Livro livro) {
        validarDadosBasicos(livro);
        validarDuplicidadeNoCadastro(livro);

        return livroDAO.salvarLivro(livro);
    }

    public Livro atualizarLivro(Livro livro) {
        if (livro.getId() == null) {
            throw new IllegalArgumentException("Id do livro deve ser informado para atualizacao.");
        }

        validarDadosBasicos(livro);
        validarDuplicidadeCodigoBarrasNoUpdate(livro);

        return livroDAO.atualizarLivro(livro);
    }

    public void removerLivro(int id) {
        livroDAO.excluirLivro(id);
    }

    public Livro obterLivroPorId(int id) {
        return livroDAO.buscarLivroPorId(id);
    }

    public Livro obterLivroPorCodigoDeBarras(String codigoDeBarras) {
        return livroDAO.buscarLivroPorCodigoDeBarras(codigoDeBarras);
    }

    public ArrayList<Livro> listarTodosLivros() {
        return livroDAO.listarTodosLivros();
    }

    private void validarDadosBasicos(Livro livro) {
        if (livro == null) {
            throw new IllegalArgumentException("Livro nao pode ser nulo.");
        }

        if (isBlank(livro.getCodigoDeBarras())) {
            throw new IllegalArgumentException("Codigo de barras e obrigatorio.");
        }

        if (isBlank(livro.getTitulo())) {
            throw new IllegalArgumentException("Titulo e obrigatorio.");
        }

        if (isBlank(livro.getAutor())) {
            throw new IllegalArgumentException("Autor e obrigatorio.");
        }

        if (livro.getAnoPublicacao() == null || livro.getAnoPublicacao() <= 0) {
            throw new IllegalArgumentException("Ano de publicacao deve ser maior que zero.");
        }

        if (livro.getPreco() == null || livro.getPreco() <= 0) {
            throw new IllegalArgumentException("Preco deve ser maior que zero.");
        }
    }

    private void validarDuplicidadeNoCadastro(Livro novoLivro) {
        Livro livroMesmoCodigo = livroDAO.buscarLivroPorCodigoDeBarras(novoLivro.getCodigoDeBarras());
        if (livroMesmoCodigo != null) {
            throw new IllegalArgumentException("Ja existe livro com este codigo de barras.");
        }

        ArrayList<Livro> livrosCadastrados = livroDAO.listarTodosLivros();
        for (Livro livro : livrosCadastrados) {
            boolean mesmoTitulo = livro.getTitulo().equalsIgnoreCase(novoLivro.getTitulo());
            boolean mesmoAutor = livro.getAutor().equalsIgnoreCase(novoLivro.getAutor());
            boolean mesmoAno = livro.getAnoPublicacao().equals(novoLivro.getAnoPublicacao());

            if (mesmoTitulo && mesmoAutor && mesmoAno) {
                throw new IllegalArgumentException("Livro ja existe na biblioteca.");
            }
        }
    }

    private void validarDuplicidadeCodigoBarrasNoUpdate(Livro livroAtualizado) {
        Livro livroMesmoCodigo = livroDAO.buscarLivroPorCodigoDeBarras(livroAtualizado.getCodigoDeBarras());
        if (livroMesmoCodigo != null && !livroMesmoCodigo.getId().equals(livroAtualizado.getId())) {
            throw new IllegalArgumentException("Codigo de barras em uso por outro livro.");
        }
    }

    private boolean isBlank(String valor) {
        return valor == null || valor.trim().isEmpty();
    }
}
