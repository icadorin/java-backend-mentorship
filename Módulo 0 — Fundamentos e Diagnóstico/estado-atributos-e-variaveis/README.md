# Estado, Atributos e Variáveis

## 1 — O que é o estado de um objeto?

O estado de um objeto é representado pelos valores de seus atributos de instância em determinado momento.

---

## 2 — O que é um atributo (field)?

Atributos (fields) são variáveis declaradas dentro de uma classe que representam dados associados às suas instâncias ou à própria classe.

---

## 3 — Qual a relação entre atributos e estado?

Os atributos de instância representam parte do estado do objeto. Quando seus valores são alterados, o estado do objeto pode ser alterado.

---

## 4 — O que é uma variável local?

É uma variável declarada dentro de um método ou bloco, com acesso limitado ao seu respectivo escopo.

---

## 5 — O que é um parâmetro de método?

É uma variável declarada na assinatura de um método para receber um valor durante sua chamada.

---

## 6 — Qual a diferença entre atributo, variável local e parâmetro?

Atributo pertence à classe ou à instância e representa parte de seu estado.

Variável local é declarada dentro de um método ou bloco.

Parâmetro é uma variável usada pelo método para receber um valor durante sua chamada.

---

## 7 — O que é escopo?

É a região do código na qual uma variável pode ser acessada.

---

## 8 — Qual é o escopo dos elementos estudados?

Atributos de instância pertencem à instância e podem ser acessados pelos contextos que possuem acesso a eles.

Variáveis locais podem ser acessadas dentro do escopo em que foram declaradas.

Parâmetros podem ser acessados dentro do método e dos escopos internos correspondentes.

---

## 9 — O que é ciclo de vida?

É o período durante o qual uma variável ou objeto existe.

---

## 10 — Qual a diferença entre escopo e ciclo de vida?

Escopo representa onde uma variável pode ser acessada.

Ciclo de vida representa durante quanto tempo ela existe.

---

## 11 — Por que um método pode acessar diretamente um atributo de instância?

Porque o atributo faz parte do estado da instância e está associado ao objeto sobre o qual o método está sendo executado.

---

## 12 — Por que uma variável local ou parâmetro não pode ser acessado por outro método?

Porque seu escopo está limitado ao contexto em que foi declarado.

---

## 13 — Como um método pode alterar o estado de um objeto?

Modificando o valor de um ou mais atributos que fazem parte do estado do objeto.

---

## 14 — Identifique `age`, `years` e `bonus`

No código:

```java
class Person {

    int age;

    void birthday(int years) {
        int bonus = 1;
        age += years + bonus;
    }

}
```

```text
age   → atributo
years → parâmetro do método
bonus → variável local
```

---

## 15 — Qual é o estado antes e depois de `birthday(5)`?

Considerando:

```java
Person person = new Person();

person.age = 20;
person.birthday(5);
```

Antes da chamada:

```text
age = 20
```

Durante a execução:

```text
years = 5
bonus = 1
```

Cálculo:

```text
20 + 5 + 1 = 26
```

Depois da chamada:

```text
age = 26
```

O estado foi alterado porque o valor do atributo `age` foi modificado.

---
