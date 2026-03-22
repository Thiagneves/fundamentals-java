package atividade1_livraria;

import java.util.ArrayList;

public class LivroDAO {
    private final ArrayList<Livro> livros = new ArrayList<>();
    private int proximoId = 1;

    public Livro salvarLivro(Livro livro) {
        validarCodigoDeBarrasUnico(livro.getCodigoDeBarras(), null);

        livro.setId(proximoId);
        livros.add(livro);
        proximoId++;

        return livro;
    }

    public Livro atualizarLivro(Livro livro) {
        if (livro.getId() == null) {
            throw new IllegalArgumentException("Livro nao encontrado para atualizacao.");
        }

        int indice = buscarIndicePorId(livro.getId());
        if (indice == -1) {
            throw new IllegalArgumentException("Livro nao encontrado para atualizacao.");
        }

        validarCodigoDeBarrasUnico(livro.getCodigoDeBarras(), livro.getId());
        livros.set(indice, livro);

        return livro;
    }

    public void excluirLivro(int id) {
        int indice = buscarIndicePorId(id);
        if (indice == -1) {
            throw new IllegalArgumentException("Livro nao encontrado para exclusao.");
        }

        livros.remove(indice);
    }

    public Livro buscarLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() != null && livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public Livro buscarLivroPorCodigoDeBarras(String codigoDeBarras) {
        for (Livro livro : livros) {
            if (livro.getCodigoDeBarras().equals(codigoDeBarras)) {
                return livro;
            }
        }
        return null;
    }

    public ArrayList<Livro> listarTodosLivros() {
        return new ArrayList<>(livros);
    }

    private int buscarIndicePorId(int id) {
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.getId() != null && livro.getId() == id) {
                return i;
            }
        }
        return -1;
    }

    private void validarCodigoDeBarrasUnico(String codigoDeBarras, Integer idIgnorado) {
        for (Livro livro : livros) {
            boolean mesmoCodigo = livro.getCodigoDeBarras().equals(codigoDeBarras);
            boolean ehOutroLivro = idIgnorado == null || !livro.getId().equals(idIgnorado);

            if (mesmoCodigo && ehOutroLivro) {
                throw new IllegalArgumentException("Codigo de barras ja cadastrado.");
            }
        }
    }
}
