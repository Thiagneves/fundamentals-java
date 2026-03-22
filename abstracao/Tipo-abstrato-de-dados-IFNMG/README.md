[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/PwMymWtq)
# Atividade: Tipos Abstratos de Dados - Implementação com Classes e Objetos

## Orientações

Esta atividade foca no conceito de **Tipos Abstratos de Dados (TADs)** e como eles são implementados em Java utilizando classes e objetos. Um TAD define um conjunto de valores e um conjunto de operações para esses valores, escondendo os detalhes da implementação.

1.  Cada uma das questões deve ser entregue dentro de um pacote. Exemplo: `questao01`, `questao02`, ..., `questaoXX`.
2.  Dentro de cada pacote deve haver uma classe chamada `Principal` que deverá ter o método `main`.
3.  **Para todas as atividades, utilize a classe `Principal` para criar instâncias (objetos) dos TADs implementados e testar suas operações**.

---

# Atividades

1.  **TAD Aluno**: Defina um TAD para representar alunos matriculados em uma disciplina.
    -   **Dados**: Nome do aluno, sua matrícula, 3 notas de provas e 1 nota de trabalho.
    -   **Operações**:
        -   Uma operação para calcular e retornar a média final do aluno, considerando que cada prova tem peso 2 e o trabalho tem peso 1,5.
    -   Implemente este TAD como uma classe Java.

2.  **TAD Livro**: Proponha um TAD para representar os livros de uma livraria.
    -   **Dados**: Título, quantidade de páginas, ano da publicação, nome da editora e nome do autor.
    -   **Operações**:
        -   Uma operação para imprimir os detalhes do livro em um formato de etiqueta, como no exemplo abaixo.
    -   Implemente o TAD com uma classe Java.

| Livro:                                                       |
| :----------------------------------------------------------- |
| **Título:** Código limpo: Habilidades práticas do Agile Software |
| **Publicação:** 2009                                             |
| **Autor:** Robert C. Martin                                      |
| **Editora:** Alta Books                                          |

3.  **Composição de TADs**: Evolua a implementação anterior, decompondo o TAD `Livro`. Crie os TADs `Autor` e `Editora` e os utilize na composição do TAD `Livro`.
    -   **TAD Autor**: Deve armazenar nome e data de nascimento.
    -   **TAD Editora**: Deve armazenar nome, CNPJ e endereço.
    -   Ajuste a operação de impressão da etiqueta para que continue funcionando.

4.  **TAD Usuário**: Implemente um TAD para representar um `Usuario`.
    -   **Dados**: Nome de usuário e senha.
    -   **Operações**:
        -   Uma operação `autenticar` que verifica se o nome de usuário e a senha fornecidos correspondem aos dados armazenados, retornando `true` em caso afirmativo e `false` caso contrário.
    -   Implemente este TAD como uma classe Java.

5.  **TADs de Figuras Geométricas**: Defina TADs para representar as seguintes figuras geométricas: `Circulo`, `Quadrado`, `Triangulo`, `Losango` e `Retangulo`.
    -   **Dados**: Cada TAD deve incluir os atributos essenciais para sua representação (ex: raio para o círculo, lados para o quadrado, etc.).
    -   **Operações**: Cada TAD deve ter uma operação que retorna o valor de sua área.
    -   Implemente cada um.

6.  **TAD RelogioDigital (sem atributos visíveis)**
    -   **Objetivo:** Implementar um TAD com foco em métodos e lógica interna, mesmo sem manter estado persistente.
    -   **Instruções:** Crie a classe `RelogioDigital` com os seguintes métodos:
        -   `exibirHoraAtual()`: imprime a hora atual do sistema.
        -   `converterMinutosEmHoras(int minutos)`: retorna uma string no formato `hh:mm`.
        -   `somarHoras(int h1, int m1, int h2, int m2)`: retorna a soma dos tempos informados.
        -   `ehHorarioValido(int h, int m)`: retorna `true` se estiver no intervalo 0-23 e 0-59.