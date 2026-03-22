# Atividade 1 - Livraria

## Questão 1 (Respondida)
Construa uma classe `Livro` com os seguintes atributos:
- id
- código de barras
- título
- autor
- ano de publicação
- gênero
- preço

## Questão 2 (Responder)
Pesquise o conceito de DAO (*Data Access Object*) e explique, com suas palavras, o que é, qual sua importância em uma aplicação e qual é a responsabilidade dessa camada no acesso a dados.

## Questão 3 (Respondida)
Construa a classe `LivroDAO` (Data Access Object de `Livro`) com os seguintes métodos:
- `salvarLivro(Livro livro)`: salva um livro no banco de dados.
- `atualizarLivro(Livro livro)`: atualiza os dados de um livro existente.
- `excluirLivro(int id)`: exclui um livro com base no id.
- `buscarLivroPorId(int id)`: busca e retorna um livro pelo id.
- `buscarLivroPorCodigoDeBarras(String codigoDeBarras)`: busca e retorna um livro pelo código de barras.
- `listarTodosLivros()`: lista todos os livros disponíveis.

Implemente os métodos de `LivroDAO` simulando o acesso a banco de dados com uma estrutura em memória (por exemplo, `List` ou `Map`).

Regras do banco de dados simulado:
- O código de barras deve ser único.
- O id deve ser único e auto-incrementado.
- O id deve ser gerado automaticamente ao salvar um novo livro.
- `atualizarLivro` deve verificar se o livro existe antes de atualizar; caso não exista, deve lançar exceção.
- `excluirLivro` deve verificar se o livro existe antes de excluir; caso não exista, deve lançar exceção.
- `buscarLivroPorId` deve retornar `null` se não encontrar o livro.
- `listarTodosLivros` deve retornar todos os livros; se não houver livros, deve retornar lista vazia.

## Questão 4 (Responder)
Pesquise o conceito de *Service Layer* (Camada de Serviço) e explique, com suas palavras, o que é, qual sua importância em uma aplicação e qual sua relação com encapsulamento.

## Questão 5 (Respondida)
Construa a classe `LivroService` (Camada de Serviço) com os seguintes métodos:
- `adicionarLivro(Livro livro)`: adiciona um novo livro usando `salvarLivro` de `LivroDAO`.
- `atualizarLivro(Livro livro)`: atualiza um livro existente usando `atualizarLivro` de `LivroDAO`.
- `removerLivro(int id)`: remove um livro usando `excluirLivro` de `LivroDAO`.
- `obterLivroPorId(int id)`: obtém um livro pelo id usando `buscarLivroPorId` de `LivroDAO`.
- `listarTodosLivros()`: lista todos os livros usando `listarTodosLivros` de `LivroDAO`.

Implemente os métodos de `LivroService` para encapsular a lógica de negócio relacionada aos livros, utilizando `LivroDAO` para acesso aos dados.

Regras da Camada de Serviço:
- `adicionarLivro` e `atualizarLivro` devem garantir unicidade do código de barras; se já existir, devem lançar exceção.
- `adicionarLivro` deve verificar se o livro já existe na biblioteca; se existir, deve lançar exceção.
- Ao adicionar um livro, valide os campos obrigatórios (`título`, `autor` e `ano de publicação`); se algum estiver nulo ou vazio, lance exceção.
- O preço deve ser positivo; em `adicionarLivro` e `atualizarLivro`, lance exceção se o valor for menor ou igual a zero.

## Questão 6 (Respondida)
Construa a classe `LivroUI` (interface de usuário) com os seguintes métodos:
- `exibirMenu()`: exibe o menu de opções.
- `lerOpcao()`: lê a opção escolhida.
- `lerLivro()`: lê os dados de um livro e retorna um objeto `Livro`.
- `exibirLivro(Livro livro)`: exibe os dados de um livro.
- `exibirTodosLivros(List<Livro> livros)`: exibe os dados de todos os livros.

Implemente os métodos de `LivroUI` para interagir com o usuário, usando `Scanner` para entrada e `System.out.println` para saída. A interface deve chamar os métodos de `LivroService` para realizar as operações.

Regras da Interface de Usuário:
- `exibirMenu` deve apresentar as opções:
1. Adicionar Livro
2. Atualizar Livro
3. Remover Livro
4. Obter Livro por Código de Barras
5. Listar Todos os Livros
6. Sair



# Atividade 2 - Locadora de Veículos

## Questão 1
Modele o domínio da aplicação com uma classe `Veiculo` contendo, no mínimo, os seguintes atributos:
- id
- tipo do veículo (ex.: carro, moto, van)
- placa
- modelo
- marca
- ano
- valor da diária
- disponível para locação (`true`/`false`)

Nesta atividade, foque na modelagem com uma única classe `Veiculo`.

## Questão 2
Implemente encapsulamento em todas as classes (atributos privados, com métodos de acesso quando necessário).

Crie construtores com sobrecarga:
- Construtor completo (com todos os campos principais).
- Construtor reduzido (com os campos mínimos para cadastro inicial).

Inclua, ao menos, um método de comportamento na entidade (por exemplo, `alugar()` e `devolver()`) para reforçar o conceito de abstração orientada a objetos.

## Questão 3
Construa a classe `VeiculoDAO` com persistência em memória usando exclusivamente `ArrayList<Veiculo>`.

Implemente os métodos:
- `salvarVeiculo(Veiculo veiculo)`
- `atualizarVeiculo(Veiculo veiculo)`
- `excluirVeiculo(int id)`
- `buscarVeiculoPorId(int id)`
- `buscarVeiculoPorPlaca(String placa)`
- `listarTodosVeiculos()`

Regras do DAO:
- `id` único e auto-incrementado.
- `placa` única.
- Em `atualizarVeiculo` e `excluirVeiculo`, lance exceção se o veículo não existir.
- Em `buscarVeiculoPorId`, retorne `null` se não encontrar.
- Em `listarTodosVeiculos`, retorne lista vazia se não houver registros.

## Questão 4
Construa a classe `VeiculoService`, responsável pelas regras de negócio, utilizando `VeiculoDAO`.

Implemente os métodos:
- `adicionarVeiculo(Veiculo veiculo)`
- `atualizarVeiculo(Veiculo veiculo)`
- `removerVeiculo(int id)`
- `obterVeiculoPorId(int id)`
- `obterVeiculoPorPlaca(String placa)`
- `listarTodosVeiculos()`
- `alugarVeiculo(int id)`
- `devolverVeiculo(int id)`

Regras da camada de serviço:
- Validar campos obrigatórios (`placa`, `modelo`, `marca`, `ano`, `valor da diária`).
- Não permitir cadastro com `placa` duplicada.
- Não permitir `valor da diária` menor ou igual a zero.
- Não permitir locação de veículo indisponível.
- Não permitir devolução de veículo que já esteja disponível.

## Questão 5
Construa a classe `VeiculoUI` para interação com o usuário via terminal (`Scanner` e `System.out.println`), chamando apenas métodos da camada `VeiculoService`.

Implemente, no mínimo, os métodos:
- `exibirMenu()`
- `lerOpcao()`
- `lerDadosVeiculo()`
- `exibirVeiculo(Veiculo veiculo)`
- `exibirTodosVeiculos(List<Veiculo> veiculos)`

Menu sugerido:
1. Adicionar veículo
2. Atualizar veículo
3. Remover veículo
4. Buscar veículo por id
5. Buscar veículo por placa
6. Listar todos os veículos
7. Alugar veículo
8. Devolver veículo
9. Sair


# Atividade 3 - Clínica de Atendimento

## Questão 1
Modele o domínio da aplicação com uma classe `Paciente` contendo, no mínimo, os seguintes atributos:
- id
- nome
- cpf
- idade
- telefone
- ativo para atendimento (`true`/`false`)

Nesta atividade, foque na modelagem da classe e na definição clara dos dados necessários.

## Questão 2
Implemente encapsulamento na classe `Paciente` (atributos privados e métodos de acesso quando necessário).

Crie construtores com sobrecarga:
- Construtor completo (com todos os campos principais).
- Construtor reduzido (com os campos mínimos para cadastro inicial).

Inclua, ao menos, métodos de comportamento para reforçar abstração, por exemplo:
- `ativarAtendimento()`
- `desativarAtendimento()`
- `atualizarTelefone(String telefone)`

## Questão 3
Construa a classe `PacienteDAO` com persistência em memória usando exclusivamente `ArrayList<Paciente>`.

Implemente os métodos:
- `salvarPaciente(Paciente paciente)`
- `atualizarPaciente(Paciente paciente)`
- `excluirPaciente(int id)`
- `buscarPacientePorId(int id)`
- `buscarPacientePorCpf(String cpf)`
- `listarTodosPacientes()`

Regras do DAO:
- `id` único e auto-incrementado.
- `cpf` único.
- Em `atualizarPaciente` e `excluirPaciente`, lance exceção se o paciente não existir.
- Em `buscarPacientePorId`, retorne `null` se não encontrar.
- Em `listarTodosPacientes`, retorne lista vazia se não houver registros.

## Questão 4
Construa a classe `PacienteService`, responsável pelas regras de negócio, utilizando `PacienteDAO`.

Implemente os métodos:
- `adicionarPaciente(Paciente paciente)`
- `atualizarPaciente(Paciente paciente)`
- `removerPaciente(int id)`
- `obterPacientePorId(int id)`
- `obterPacientePorCpf(String cpf)`
- `listarTodosPacientes()`
- `ativarPaciente(int id)`
- `desativarPaciente(int id)`

Regras da camada de serviço:
- Validar campos obrigatórios (`nome`, `cpf`, `idade`, `telefone`).
- Não permitir cadastro com `cpf` duplicado.
- Não permitir idade menor ou igual a zero.
- Não permitir ativar um paciente que já esteja ativo.
- Não permitir desativar um paciente que já esteja inativo.

## Questão 5
Construa a classe `PacienteUI` para interação com o usuário via terminal (`Scanner` e `System.out.println`), chamando apenas métodos da camada `PacienteService`.

Implemente, no mínimo, os métodos:
- `exibirMenu()`
- `lerOpcao()`
- `lerDadosPaciente()`
- `exibirPaciente(Paciente paciente)`
- `exibirTodosPacientes(List<Paciente> pacientes)`

Menu sugerido:
1. Adicionar paciente
2. Atualizar paciente
3. Remover paciente
4. Buscar paciente por id
5. Buscar paciente por CPF
6. Listar todos os pacientes
7. Ativar paciente
8. Desativar paciente
9. Sair