### **Atividade: Refatoração com Foco em Encapsulamento**

Você está trabalhando em um sistema de controle de vendas e estoque de produtos.

O sistema atualmente possui três classes principais:

- `Produto`: representa um produto à venda.
- `Venda`: responsável por registrar uma venda.
- `GerenciadorEstoque`: responsável por atualizar o estoque.

#### 📦 Classe Produto

A classe `Produto` é utilizada para armazenar as seguintes informações de cada item:

- Nome do produto
- Código do produto
- Preço
- Quantidade em estoque

Um objeto dessa classe é criado da seguinte maneira:

```java
Produto produto = new Produto();
produto.nome = "Caneta";
produto.codigo = "C123";
produto.preco = 50;
produto.quantidadeEstoque = 0;
```

#### 🧾 Regras de Negócio

- Todo produto **deve ser criado com nome, código e preço**.
- O **preço deve ser obrigatoriamente maior que zero**.
- A **quantidade em estoque deve sempre iniciar com zero**.
- O estoque **nunca deve ficar com valor negativo**.

#### 🧮 Classe Venda

A classe `Venda` contém o método `realizarVenda`, responsável por registrar uma venda e atualizar o estoque do produto. O código atual está assim:

```java
public class Venda {
    public void realizarVenda(Produto produto, int quantidade) {
        if (quantidade <= produto.quantidadeEstoque) {
            produto.quantidadeEstoque -= quantidade;
        }
    }
}
```

#### 📦 Classe GerenciadorEstoque

A classe `GerenciadorEstoque` possui um método para atualizar a quantidade em estoque, também realizando a verificação antes da alteração:

```java
public class GerenciadorEstoque {
    public void atualizarEstoque(Produto produto, int quantidade) {
        if (quantidade <= produto.quantidadeEstoque) {
            produto.quantidadeEstoque -= quantidade;
        }
    }
}
```

---

### 🎯 **Objetivo da Atividade**

Seu desafio é **refatorar este código aplicando corretamente o princípio de encapsulamento**. Com isso, você deve garantir:

- Que os atributos de `Produto` não sejam diretamente acessados ou modificados por outras classes.
- Que o processo de criação de produtos obrigue o preenchimento de nome, código e preço válido.
- Que a quantidade em estoque só possa ser modificada através de métodos controlados da própria classe.
- Que a lógica de verificação e atualização do estoque esteja centralizada e não repetida em várias classes.

---

### 📌 **O Que Você Deve Fazer**

1. Refatore a classe `Produto` aplicando encapsulamento e regras de criação segura.
2. Remova o acesso direto aos atributos nas classes `Venda` e `GerenciadorEstoque`, utilizando os métodos da nova versão da classe `Produto`.
3. Certifique-se de que todas as regras de negócio descritas estão sendo respeitadas.

---

### 🧾 Código Base com Problemas (antes da refatoração)

```java
public class Produto {
    public String nome;
    public String codigo;
    public double preco;
    public int quantidadeEstoque;
}
```

```java
public class Venda {
    public void realizarVenda(Produto produto, int quantidade) {
        if (quantidade <= produto.quantidadeEstoque) {
            produto.quantidadeEstoque -= quantidade;
        }
    }
}
```

```java
public class GerenciadorEstoque {
    public void atualizarEstoque(Produto produto, int quantidade) {
        if (quantidade <= produto.quantidadeEstoque) {
            produto.quantidadeEstoque -= quantidade;
        }
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Caneta";
        produto.codigo = "C123";
        produto.preco = 50;
        produto.quantidadeEstoque = 0;

        Venda venda = new Venda();
        venda.realizarVenda(produto, 2);

        GerenciadorEstoque gerenciador = new GerenciadorEstoque();
        gerenciador.atualizarEstoque(produto, 3);
    }
}
```