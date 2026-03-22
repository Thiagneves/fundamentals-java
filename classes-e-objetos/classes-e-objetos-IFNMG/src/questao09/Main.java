package questao09;

public class Main {
    static void main() {
        Professor professor1 = new Professor(); // professor criado!

        professor1.setNome("Marcos");
        professor1.setMateria("Matemática");
        professor1.exibirDados();

        Aluno aluno1 = new Aluno(); // aluno criado!

        aluno1.setNome("Thiago");
        aluno1.setMatricula("ADS0315-2025");
        aluno1.exibirDados();

        // ----------------------------------------------------------- //

        Atividades atividade = new Atividades(); // Atividade Criada
        aluno1.enviarAtividade(atividade, "Trabalho", "Estudos de Programação Orientada a Objetos, usando o JAVA");

        professor1.addNota(atividade, 10, 10);

        aluno1.notaAtividade(atividade);

    }
}
