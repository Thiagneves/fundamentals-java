package questao02;

public class Livro {
    public String titulo;
    public int quantidadepaginas;
    public int anopublicacao;
    public String editora;
    public String autor;

    void imprimirdetalhes(String title, int publicacao, String escritor, String editora){
        System.out.println("Livro");
        System.out.println("Título: " +title);
        System.out.println("Publicação: " +publicacao);
        System.out.println("Autor: " +escritor);
        System.out.println("Editora: " +editora);
    }
}
