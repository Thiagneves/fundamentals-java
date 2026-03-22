# Atividade: Abstração Classes e Objetos

---
## Orientações

1. Cada uma das questões deve ser entregue dentro de um pacote. Exemplo: "src/questao01","src/questao02",...,"src/questaoXX".

1. Dentro de cada pacote deve ter uma classe chamada Principal que deverá ter o método main.

1. Se necessário utilize a classe Principal de cada questão para executar os testes. Exemplo: "src/questao01/Principal.java".

1. As questões marcadas com o "✏️" devem ser respondidas no caderno.
---

## 1 — Criando uma classe simples

Crie uma classe `Personagem` com:

* nome (String)
* vida (int)
* força (int)

Crie métodos:

* `exibirStatus()` → imprime nome, vida e força
* `receberDano(int dano)` → diminui a vida. 

* Se a vida ficar menor que 0, definir como 0.

Depois:

* Crie uma classe de teste
* Instancie dois personagens
* Aplique dano em um deles
* Mostre o status antes e depois

---

## 2 — Referência vs Cópia

Crie uma classe `Conta` com:

* numero (int)
* saldo (double)

Crie método:

* `depositar(double valor)`

---

### Parte 1

No `main`:

```java
Conta c1 = new Conta();
Conta c2 = c1;
```

Depois:

* Altere o saldo via `c2`
* Imprima o saldo via `c1`

> **Pergunta:**  
> O que aconteceu? Por quê?  ✏️

---

### Parte 2 — Comparação com primitivos

```java
int a = 10;
int b = a;
b = 20;
```

> **Pergunta:**  
> Por que o comportamento foi diferente?  ✏️

---

## 3 — Criando comportamento real

Crie uma classe `Carro` com:

Atributos:

* modelo
* velocidadeAtual
* ligado (boolean)

Métodos:

* ligar()
* desligar()
* acelerar(int valor)
* frear(int valor)
* exibirStatus()

O método exibirStatus deve mostrar o modelo, velocidade atual e se está ligado ou não.

O carro  só pode acelerar ou frear se estiver ligado. A velocidade não pode ser negativa.

---

##  4 — Interação entre objetos

Faça uma melhoria no exercício do personagem para criar uma batalha entre dois personagens.

Classe `Personagem`:

* nome
* vida
* força

Método:

* `atacar(Personagem alvo)`

Regra:

* O dano causado é igual à força do atacante
* O alvo perde vida

No `main`:

* Crie dois personagens
* Faça um atacar o outro
* Exiba resultado
---

## 5 — Predição de comportamento

Dado o código:

```java
Conta a = new Conta();
a.saldo = 100;

Conta b = a;
b.saldo = 200;

System.out.println(a.saldo);
```

> **Pergunta:**  
> Qual será o valor impresso?✏️  
> Explique por quê.✏️

Depois modifique para:

```java
Conta a = new Conta();
a.saldo = 100;

Conta b = new Conta();
b = a;
```

> **Pergunta:**  
> O que muda? ✏️

---

## 6 — Encontrando o erro

Crie a classe `Pessoa`:

```java
class Pessoa {
    String nome;
    int idade;

    void definirDados(String nome, int idade) {
        nome = nome;
        idade = idade;
    }
}
```

> **Perguntas:**    
> O que está errado?✏️  
> Por que os atributos não mudam?✏️  
> Como corrigir?✏️

> Corrija o código para que os atributos sejam definidos corretamente.


## 7 - Escopo de variáveis

Crie a classe `TesteEscopo`:

```java
class TesteEscopo {
    int numero = 10;

    void metodo() {
        int numero = 20;
        System.out.println(numero);
    }
}
    
```

> **Perguntas:**  
> O que será impresso?✏️  
> Como imprimir o atributo da classe?✏️  
> Como imprimir o valor local?✏️

## 8 - Corrigindo Código com Erro de Escopo

Considere a classe abaixo:

```java
class Conta {
    double saldo;

    void depositar(double saldo) {
        saldo += saldo;
    }
}
```
> **Pergunta**:  
> Por que o saldo da conta não muda?✏️   

> Corrija o método para que funcione corretamente.

## 9 - Modelando um Sistema

Uma escola deseja criar um sistema simples para controlar a entrega de trabalhos.

O sistema deve permitir que:

- Um aluno envie um trabalho.

- O professor atribua uma nota ao trabalho.

- O aluno possa consultar sua nota.

- Um trabalho tenha um título e um conteúdo.

- Um aluno tenha nome e matrícula.

a. Identifique as classes principais envolvidas no problema.

b. Para cada classe, defina:

- Seus atributos

- Seus métodos

- Indique quais classes precisam interagir entre si.

- Não é necessário escrever código completo, apenas a estrutura. (Pode usar UML: draw.io ou plantuml.com)
