package questao06;

public class Pessoa {
    private String nome; // Ambos atributos privados
    private int idade;

    // Podemos alterar o Metodo usando this.
    void definirDados(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Ou podemos usar os sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nomw) {
        this.nome = nomw;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /*
     * O modelo anterior visto no README.md mostra erros comuns de iniciantes, no JAVA podemos usar o this. para indicar que quem vai recever aquela informação é o
     * Atributo daquela classe, é bastante importante a sua utilização para que o computador não confunda já que o "Atibuto" do Metodo tem o mesmo nome.
     */
}
