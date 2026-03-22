
### 🖊️ **Atividade: Encapsulamento e Centralização de Lógica na Assinatura Eletrônica de Documentos**

Você está desenvolvendo um sistema de **assinatura eletrônica de documentos**. O sistema possui as seguintes classes:

- `Usuario`: representa uma pessoa cadastrada no sistema, com senha para assinatura.
- `Documento`: representa o documento que será assinado.
- `AssinadorDocumento`: realiza o processo de assinatura.
- `ValidadorSenha`: valida senhas digitadas pelos usuários.

#### 👤 Classe Usuario

A classe `Usuario` possui as seguintes informações:

- Nome completo
- E-mail
- Senha para assinatura (armazenada em texto simples, apenas para fins didáticos)

Atualmente, os objetos são criados assim:

```java
Usuario usuario = new Usuario();
usuario.nome = "João Pedro";
usuario.email = "joao@email.com";
usuario.senhaAssinatura = "123456";
```

#### 📜 Regras de Negócio

- A senha de assinatura é pessoal e deve ser validada sempre que o usuário assinar um documento.
- A lógica de validação da senha **está espalhada** por diferentes classes, que fazem a verificação diretamente:

```java
if (senhaDigitada.equals(usuario.senhaAssinatura)) {
    // assina o documento
}
```

- A senha **nunca deve ser comparada fora da classe `Usuario`**. A verificação deve ser feita por um método da própria classe, como `validarSenha(String senhaDigitada)`.
- Uma vez assinado, o documento não pode ser alterado nem ser marcado como não assinado novamente.
---

### 📄 Classe Documento

Um documento possui título, conteúdo e uma flag `assinado`, indicando se foi assinado:

```java
public class Documento {
    public String titulo;
    public String conteudo;
    public boolean assinado = false;
}
```

---

### 🖋️ Classe AssinadorDocumento

Esta classe executa o processo de assinatura:

```java
public class AssinadorDocumento {
    public void assinarDocumento(Usuario usuario, Documento documento, String senhaDigitada) {
        if (senhaDigitada.equals(usuario.senhaAssinatura)) {
            documento.assinado = true;
        }
    }
}
```

---

### 🔒 Classe ValidadorSenha

Outra classe do sistema também valida a senha, duplicando a lógica:

```java
public class ValidadorSenha {
    public boolean validar(Usuario usuario, String senhaDigitada) {
        return senhaDigitada.equals(usuario.senhaAssinatura);
    }
}
```

---

### 🎯 **Objetivo da Atividade**

Seu desafio é **refatorar o sistema aplicando corretamente o encapsulamento**. Para isso, você deve:

- Tornar o atributo `senhaAssinatura` inacessível diretamente por outras classes.
- Criar um método dentro da classe `Usuario` que encapsule a lógica de validação de senha.
- Garantir que a senha **nunca seja validada fora da classe `Usuario`**.
- Refatorar `AssinadorDocumento` e `ValidadorSenha` para usarem esse novo método.
- Garantir que o documento não possa ser alterado após ser assinado.
- Ao criar um `Documento`, ele obrigatoriamente deve ter um título e conteúdo e deve iniciar com a flag `assinado` como `false`.
- O usuário ao ser criado deve obrigatorialmente ter uma senha e um nome.
- O usuário ao ser criado pode ou não ter um e-mail.

---

### 📌 Código Base com Problemas

```java
public class Usuario {
    public String nome;
    public String email;
    public String senhaAssinatura;
}
```

```java
public class Documento {
    public String titulo;
    public String conteudo;
    public boolean assinado = false;
}
```

```java
public class AssinadorDocumento {
    public void assinarDocumento(Usuario usuario, Documento documento, String senhaDigitada) {
        if (senhaDigitada.equals(usuario.senhaAssinatura)) {
            documento.assinado = true;
        }
    }
}
```

```java
public class ValidadorSenha {
    public boolean validar(Usuario usuario, String senhaDigitada) {
        return senhaDigitada.equals(usuario.senhaAssinatura);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.nome = "João Pedro";
        usuario.email = "joao@email.com";
        usuario.senhaAssinatura = "123456";

        Documento doc = new Documento();
        doc.titulo = "Contrato";
        doc.conteudo = "Contrato de prestação de serviço...";

        AssinadorDocumento assinador = new AssinadorDocumento();
        assinador.assinarDocumento(usuario, doc, "123456");

        System.out.println("Documento assinado? " + doc.assinado);
    }
}
```