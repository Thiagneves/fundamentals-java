### 💳 **Atividade: Encapsulamento e Validação em Sistema de Pagamento Digital**

Você está desenvolvendo um sistema de **carteira digital**, onde os usuários podem fazer pagamentos uns aos outros. O sistema possui as seguintes classes:

- `Usuario`: representa um usuário com um nome, saldo e uma senha de pagamento.
- `Pagamento`: representa a operação de transferência de valor de um usuário para outro.
- `ServicoPagamento`: realiza o pagamento entre usuários.

#### 🧍 Classe Usuario

A classe `Usuario` tem os seguintes atributos:

- `nome`
- `senhaPagamento`
- `saldo`

Objetos estão sendo criados assim:

```java
Usuario usuario1 = new Usuario();
usuario1.nome = "Maria";
usuario1.senhaPagamento = "senha123";
usuario1.saldo = 100.0;
```

#### 💼 Regras de Negócio

- A senha de pagamento **deve ser validada** sempre que um pagamento for realizado.
- O pagamento **só deve acontecer se o usuário tiver saldo suficiente**.
- Nenhuma outra classe deveria acessar ou alterar o saldo diretamente.
- A senha também **não deve ser verificada fora da classe `Usuario`** — deve existir um método como `validarSenha(String senhaDigitada)`.

---

### 💸 Classe ServicoPagamento

A classe `ServicoPagamento` realiza o pagamento, mas atualmente **viola o encapsulamento** ao acessar diretamente `saldo` e `senhaPagamento` dos usuários:

```java
public class ServicoPagamento {
    public void realizarPagamento(Usuario pagador, Usuario recebedor, double valor, String senhaDigitada) {
        if (senhaDigitada.equals(pagador.senhaPagamento)) {
            if (pagador.saldo >= valor) {
                pagador.saldo -= valor;
                recebedor.saldo += valor;
            }
        }
    }
}
```

---

### 🧠 Problemas

- A senha está sendo comparada fora da classe `Usuario`.
- O saldo está sendo modificado diretamente, tanto no `pagador` quanto no `recebedor`.
- A lógica de "ver se tem saldo suficiente" deveria estar encapsulada.
- As validações e regras estão espalhadas e duplicadas.

---

### 🎯 **Objetivo da Atividade**

Refatore as classes para aplicar corretamente os princípios de **encapsulamento** e manter as **regras de negócio centralizadas**. Para isso, você deve:

- Tornar os atributos `saldo` e `senhaPagamento` privados.
- Adicionar métodos na classe `Usuario` para validar a senha e realizar um pagamento seguro.
- Garantir que o valor só seja debitado ou creditado com validações adequadas.
- Remover qualquer lógica de verificação de senha ou alteração de saldo de fora da classe `Usuario`.

---

### 📌 Código Base com Problemas

```java
public class Usuario {
    public String nome;
    public String senhaPagamento;
    public double saldo;
}
```

```java
public class ServicoPagamento {
    public void realizarPagamento(Usuario pagador, Usuario recebedor, double valor, String senhaDigitada) {
        if (senhaDigitada.equals(pagador.senhaPagamento)) {
            if (pagador.saldo >= valor) {
                pagador.saldo -= valor;
                recebedor.saldo += valor;
            }
        }
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Usuario maria = new Usuario();
        maria.nome = "Maria";
        maria.senhaPagamento = "senha123";
        maria.saldo = 100.0;

        Usuario joao = new Usuario();
        joao.nome = "João";
        joao.senhaPagamento = "senha456";
        joao.saldo = 50.0;

        ServicoPagamento servico = new ServicoPagamento();
        servico.realizarPagamento(maria, joao, 30.0, "senha123");

        System.out.println("Saldo Maria: " + maria.saldo);
        System.out.println("Saldo João: " + joao.saldo);
    }
}
```