# Perguntas e Respostas sobre Orientação a Objetos

## 1 — O que é uma classe?

Abstração/modelo/molde que define a estrutura e o comportamento dos objetos.  
Pode ser entendida como uma espécie de forma que define quais dados e comportamentos os objetos daquela classe podem possuir.

---

## 2 — O que é um objeto?

Uma instância concreta de uma classe.  
Pode ser entendido como um bolo criado a partir de uma forma, onde a forma representa a classe e o bolo representa o objeto. Uma mesma classe pode dar origem a vários objetos diferentes.

---

## 3 — Para que classes existem?

Permitem modelar e organizar estado e comportamento, criando uma estrutura que pode dar origem a vários objetos.

---

## 4 — Qual problema elas resolvem?

Permitem organizar dados e comportamentos relacionados em uma unidade.

---

## 5 — Qual a diferença entre classe e objeto?

- **Classe** = definição/modelo.
- **Objeto** = uma instância concreta daquela definição.

A classe define a estrutura e os comportamentos; o objeto é uma ocorrência concreta dessa classe.

---

## 6 — O que são atributos e variáveis?

Atributo é uma variável que pertence a uma classe ou a uma instância de uma classe e representa parte do seu estado.  
Variável é um espaço nomeado utilizado para armazenar uma referência ou um valor durante a execução do programa.  
Um atributo é um tipo de variável, mas nem toda variável é um atributo.

```java
class Person {
    String name; // atributo
    int age;     // atributo

    void sayHello() {
        String message = "Olá"; // variável local
    }
}
```

---

## 7 — O que são métodos?

Métodos são comportamentos definidos dentro de uma classe.  
Eles podem receber dados, executar operações e, opcionalmente, retornar um resultado.

---

## 8 — O que significa instanciar um objeto?

Criar uma instância de uma classe.  
Criar um objeto a partir da definição fornecida pela classe.

---

## 9 — O que acontece quando usamos `new`?

O operador `new` é utilizado para criar uma nova instância de uma classe.

```
classe
   ↓
new
   ↓
objeto na memória
   ↑
referência
   ↑
variável person
```

```java
Person person = new Person();
```

Referência é o valor utilizado pela variável para permitir o acesso ao objeto.  
O objeto e a variável que contém sua referência não são a mesma coisa.  
_Nota: os detalhes de memória, referências, stack, heap e gerenciamento dos objetos pela JVM serão estudados posteriormente._

---

## 10 — Qual a relação disso com POO?

POO (Programação Orientada a Objetos) é um paradigma de programação que organiza o software em torno de objetos, seus estados e comportamentos.  
Classes são utilizadas para definir a estrutura e o comportamento desses objetos.  
Conceitos como encapsulamento, herança, polimorfismo e abstração fazem parte dos principais conceitos tradicionalmente utilizados no estudo de POO.
