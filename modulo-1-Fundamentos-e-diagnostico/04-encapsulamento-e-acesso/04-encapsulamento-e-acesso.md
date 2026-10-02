# Encapsulamento e Modificadores de Acesso

## 1 — O que é encapsulamento?

Encapsulamento é o princípio de **reunir estado e comportamento dentro de uma classe e controlar como esse estado pode ser acessado ou alterado**.

Uma classe possui seus dados internamente e define quais operações podem ser realizadas sobre eles.

Conceitualmente:

```text
estado interno
      ↓
classe controla o acesso
      ↓
comportamentos disponibilizados
      ↓
interação com o objeto
```

Encapsulamento não significa apenas colocar os atributos como `private`. O `private` é uma das ferramentas da linguagem Java utilizadas para controlar o acesso ao estado da classe.

---

## 2 — Qual problema o encapsulamento resolve?

O encapsulamento ajuda a evitar o **acesso descontrolado ao estado de um objeto**.

Sem esse controle, outras partes do programa poderiam alterar diretamente os dados internos e colocar o objeto em um estado inválido.

Por exemplo, conceitualmente:

```text
Pessoa
 ├── idade
 └── altura
```

Se esses valores fossem modificados livremente:

```text
idade = -10
altura = -5
```

o objeto poderia assumir um estado inválido.

Com encapsulamento, a classe pode controlar como essas alterações acontecem e aplicar regras antes de modificar seu estado.

A ideia central é:

> **O objeto não entrega seu estado indiscriminadamente; ele controla como seu estado pode ser utilizado e alterado.**

---

## 3 — Encapsulamento e `private`

`private` é um **modificador de acesso**.

Quando um atributo é declarado como `private`, ele pode ser acessado diretamente **somente dentro da própria classe**.

Exemplo:

```java
class Pessoa {

    private int idade;
}
```

Dentro de `Pessoa`, o atributo pode ser utilizado normalmente.

Fora da classe:

```text
outra classe ──X──> idade
```

O acesso direto é bloqueado.

Isso cria uma fronteira em torno do estado interno da classe.

---

## 4 — Como outra classe acessa um atributo `private`?

A classe pode disponibilizar comportamentos públicos para permitir o acesso de acordo com o que foi definido por ela.

Por exemplo:

```java
class Pessoa {

    private int idade;

    public int getIdade() {
        return idade;
    }
}
```

O atributo `idade` continua sendo `private`, mas a classe oferece um método público:

```text
getIdade()
```

Outra classe não acessa diretamente o atributo. Ela solicita o valor por meio do comportamento disponibilizado pela própria `Pessoa`.

Conceitualmente:

```text
SEM encapsulamento:

outra classe ──────────────> idade
                             ↑
                         acesso direto


COM encapsulamento:

outra classe ──> getIdade() ──> idade
                         ↑
                  classe controla
                   o acesso ao estado
```

---

## 5 — Getter

Um **getter** é um método utilizado para **obter** um valor do objeto.

Exemplo:

```java
public int getIdade() {
    return idade;
}
```

Conceitualmente:

```text
getIdade()
    ↓
obtém o valor de idade
```

O getter não torna o atributo público. O atributo continua protegido pelo modificador de acesso.

---

## 6 — Setter

Um **setter** é um método utilizado para **alterar** um valor do objeto.

Exemplo:

```java
public void setIdade(int idade) {
    this.idade = idade;
}
```

Conceitualmente:

```text
setIdade(valor)
      ↓
altera o estado
```

Um setter pode conter regras antes de realizar a alteração.

Portanto, encapsulamento não significa que a existência de um setter elimina automaticamente o controle sobre o estado.

---

## 7 — Encapsulamento não exige getter e setter para tudo

Um erro comum é pensar que encapsulamento significa obrigatoriamente:

```text
atributo private
      ↓
getter
      ↓
setter
```

Isso não é uma regra.

Uma classe pode escolher quais informações serão expostas e quais alterações serão permitidas.

Alguns atributos podem ter apenas getter.

Outros podem não possuir getter nem setter.

A classe também pode expor comportamentos que representam ações do objeto.

Por exemplo:

```text
sacar(valor)
depositar(valor)
adicionarProduto(produto)
removerProduto(produto)
alterarSenha(novaSenha)
```

A classe pode controlar essas operações e aplicar suas regras antes de modificar o estado.

---

## 8 — `sacar()` em vez de `setSaldo()`

Considere uma classe `Conta` com um atributo `saldo`.

Uma abordagem seria disponibilizar:

```text
setSaldo(valor)
```

Outra possibilidade é disponibilizar comportamentos como:

```text
depositar(valor)
sacar(valor)
```

A diferença conceitual é importante.

`setSaldo()` representa uma **atribuição direta de estado**.

Já `sacar(valor)` representa um **comportamento da conta**.

Dentro desse comportamento, a classe pode aplicar regras relacionadas à operação antes de alterar o estado.

Conceitualmente:

```text
outra classe
      ↓
sacar(valor)
      ↓
Conta verifica as regras
      ↓
altera o saldo
```

Assim, a própria classe mantém maior controle sobre seu estado.

---

## 9 — Encapsulamento e modificadores de acesso

Java possui quatro níveis principais de acesso:

```text
private
package-private
protected
public
```

Esses níveis determinam **onde um membro da classe pode ser acessado**.

Conceitualmente:

```text
private
   ↓
package-private
   ↓
protected
   ↓
public
```

Cada nível possui um alcance diferente.

---

## 10 — `private`

`private` é o modificador de acesso mais restrito.

Um membro `private` pode ser acessado diretamente somente pela própria classe.

Exemplo:

```java
class Pessoa {

    private int idade;
}
```

Conceitualmente:

```text
própria classe → ✅
mesmo package  → ❌
outro package  → ❌
```

---

## 11 — Package-private

Quando nenhum modificador de acesso é declarado, o membro recebe acesso **package-private**.

Exemplo:

```java
class Pessoa {

    int idade;
}
```

Como nenhum modificador foi escrito, `idade` possui acesso package-private.

Esse acesso permite que o membro seja utilizado por classes que pertencem ao **mesmo package**.

Conceitualmente:

```text
mesma classe  → ✅
mesmo package → ✅
outro package → ❌
```

Package-private não é uma palavra-chave do Java. É o nome utilizado para esse nível de acesso quando nenhum modificador é declarado.

---

## 12 — `protected`

`protected` permite acesso:

* dentro da própria classe;
* dentro do mesmo package;
* por subclasses, de acordo com as regras de herança, inclusive quando estão em outro package.

Conceitualmente:

```text
mesma classe            → ✅
mesmo package           → ✅
subclasse em outro package → ✅
outro lugar             → ❌
```

O comportamento completo de `protected` será aprofundado posteriormente no estudo de **herança**.

---

## 13 — `public`

`public` é o modificador de acesso mais amplo.

Um membro `public` pode ser acessado de outros lugares onde a própria classe esteja acessível.

Exemplo:

```java
class Pessoa {

    public void apresentar() {
        // ...
    }
}
```

Outra classe pode utilizar o comportamento:

```text
pessoa.apresentar()
```

Isso permite que a classe disponibilize uma interface de uso para o restante do sistema.

---

## 14 — Comparação dos modificadores de acesso

| Modificador | Mesma classe | Mesmo package | Subclasse em outro package | Outro lugar |
| ------------ | :----------: | :------------: | :------------------------: | :---------: |
| `private` | ✅ | ❌ | ❌ | ❌ |
| package-private | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `public` | ✅ | ✅ | ✅ | ✅ |

Essa tabela resume o alcance de acesso dos principais modificadores.

---

## 15 — Encapsulamento não é apenas esconder atributos

É importante diferenciar **princípio** de **mecanismo da linguagem**.

### Encapsulamento

É um princípio de Programação Orientada a Objetos relacionado ao controle da exposição e da manipulação do estado e dos comportamentos de um objeto.

### `private`, package-private, `protected` e `public`

São recursos da linguagem Java utilizados para definir **níveis de acesso**.

Conceitualmente:

```text
Encapsulamento
      ↓
princípio de design

modificadores de acesso
      ↓
recursos da linguagem
      ↓
controlam quem pode acessar determinados membros
```

Portanto:

> **`private` ajuda a implementar encapsulamento, mas encapsulamento não é sinônimo de `private`.**

---

## 16 — Encapsulamento como controle do comportamento

Uma classe encapsulada não precisa apenas esconder seus dados.

Ela pode definir **quais operações fazem sentido para interagir com seu estado**.

Por exemplo, uma `Conta` pode disponibilizar:

```text
depositar(valor)
sacar(valor)
```

enquanto mantém:

```text
saldo
```

como estado interno.

Conceitualmente:

```text
                 ┌─────────────────────┐
                 │       Conta         │
                 │                     │
outra classe ───>│ depositar(valor)    │
                 │ sacar(valor)        │
                 │                     │
                 │ private saldo       │
                 └─────────────────────┘
```

A parte externa conhece as operações disponibilizadas, mas não precisa manipular diretamente o estado interno.

---

## 17 — Benefício da separação entre interface e implementação

Quando a classe controla sua implementação interna, quem utiliza o objeto pode depender principalmente dos comportamentos que a classe disponibiliza.

Conceitualmente:

```text
código externo
      ↓
comportamento público
      ↓
implementação interna
      ↓
estado interno
```

A implementação interna pode ser modificada sem necessariamente alterar a forma como o restante do sistema utiliza a classe, desde que o comportamento disponibilizado continue compatível.

Isso ajuda a criar uma separação entre:

* o que a classe **oferece**;
* e como a classe **faz internamente**.

---

## 18 — Resumo

* Encapsulamento é o princípio de controlar a exposição e a manipulação do estado e dos comportamentos de um objeto.
* O objetivo é evitar acesso descontrolado ao estado interno.
* `private` é um modificador de acesso e permite acesso direto somente dentro da própria classe.
* Encapsulamento não é sinônimo de `private`.
* Getter é um método utilizado para obter um valor.
* Setter é um método utilizado para alterar um valor.
* Encapsulamento não exige que todo atributo tenha getter e setter.
* Um setter pode conter regras antes de alterar o estado.
* Métodos como `sacar()` e `depositar()` podem representar comportamentos da classe e controlar alterações de estado.
* `package-private` ocorre quando nenhum modificador de acesso é declarado.
* Package-private permite acesso dentro do mesmo package.
* `protected` permite acesso dentro do mesmo package e por subclasses, de acordo com as regras de herança.
* `public` possui o maior alcance de acesso.
* Modificadores de acesso são recursos da linguagem Java utilizados para controlar quem pode acessar determinados membros.
* Encapsulamento busca criar uma fronteira entre o estado interno do objeto e a forma como o restante do sistema interage com ele.
