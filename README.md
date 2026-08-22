> [!NOTE]
> **📌 Sobre este documento**
>
> Este documento foi criado com auxílio de Inteligência Artificial (IA) e também é utilizado como contexto para a IA que acompanha esta mentoria.
>
> Seu objetivo é manter registradas a metodologia, a estrutura da trilha, o currículo, as regras de estudo e o estado atual do aprendizado.
>
> Quando uma nova conversa for iniciada, este documento poderá ser fornecido à IA para que ela consiga compreender o propósito da mentoria, a forma como os assuntos devem ser estudados e de onde continuar o aprendizado, evitando a necessidade de reconstruir todo o contexto novamente.
>
> A IA atua como mentor técnico, explicador e revisor, enquanto a implementação dos exercícios e a construção do conhecimento continuam sendo responsabilidade do aluno.

# Mentoria Backend Java

Uma trilha de estudo estruturada para desenvolver uma base sólida em **Java, Backend, Ciência da Computação e Engenharia de Software**.

O objetivo não é apenas aprender a utilizar APIs, frameworks ou decorar soluções. A prioridade é **entender como e por que as coisas funcionam**, praticar os conceitos e desenvolver autonomia para continuar aprendendo novas tecnologias.

---

## Objetivo

Esta mentoria tem como objetivo construir uma base sólida em:

- Java
- Programação Orientada a Objetos
- Estruturas de dados
- Algoritmos
- Collections
- Generics
- Tratamento de erros
- Java funcional
- Streams
- Concorrência
- JVM
- Banco de Dados
- Engenharia de Software
- Arquitetura
- Spring

O objetivo final é conseguir:

- programar em Java com segurança;
- compreender os principais recursos da linguagem;
- entender os fundamentos por trás das abstrações;
- resolver problemas sem depender de IA;
- ler documentação técnica;
- compreender estruturas de dados e algoritmos;
- trabalhar com concorrência;
- compreender a JVM;
- trabalhar com banco de dados;
- compreender princípios de engenharia de software;
- compreender arquitetura;
- utilizar Spring conscientemente;
- investigar como frameworks funcionam internamente;
- aprender novas tecnologias de forma independente.

> **O objetivo não é simplesmente saber Java.**
> **O objetivo é saber programar, compreender software e conseguir continuar aprendendo sozinho.**

---

# Filosofia da Mentoria

## 1. Entender antes de construir

Nem todo conceito precisa virar um projeto.

A prioridade é:

> **Entender → praticar → consolidar → avançar.**

Projetos maiores serão utilizados somente quando houver um conjunto suficiente de conceitos para que sua construção realmente agregue valor.

---

## 2. Teoria antes da prática

Cada assunto será estudado primeiro teoricamente.

A teoria deve responder, sempre que aplicável:

- O que é?
- Por que existe?
- Qual problema resolve?
- Como funciona?
- Quando utilizar?
- Quando não utilizar?
- Quais são suas limitações?
- Quais conceitos estão relacionados?
- O que acontece por baixo da abstração?

Depois da teoria será realizado um exercício pequeno e objetivo.

---

## 3. Exercícios objetivos

O exercício deve testar principalmente **o conceito estudado**.

Não é necessário construir uma aplicação completa para aprender uma funcionalidade específica.

### Exemplo

**Tema:** Threads

O exercício pode:

1. criar duas threads;
2. executar uma tarefa simultaneamente;
3. demonstrar um problema de concorrência;
4. aplicar `synchronized`;
5. observar a diferença de comportamento.

O objetivo é compreender Threads e sincronização, não construir uma aplicação inteira.

---

## 4. Fundamentos antes das abstrações

Antes de utilizar uma abstração complexa, os fundamentos necessários serão estudados.

Por exemplo, antes de aprofundar `HashMap`:

- hashing;
- `hashCode()`;
- `equals()`;
- colisões;
- complexidade.

Antes de estudar Dependency Injection no Spring:

- objetos;
- interfaces;
- composição;
- inversão de controle;
- reflection;
- annotations.

A ideia é evitar aprender apenas **“como usar”** uma ferramenta sem entender o problema que ela resolve.

---

# Autonomia

A mentoria deve aumentar gradualmente a independência do aluno.

Durante exercícios, o objetivo é tentar resolver o problema antes de buscar uma solução pronta.

### Recursos permitidos

- documentação oficial;
- Javadocs;
- livros;
- artigos técnicos;
- código-fonte da JDK;
- experimentos próprios;
- testes no IDE.

### Regra principal

A IA será utilizada como **mentor e revisor**, não como substituta da implementação.

O aluno deve tentar implementar os exercícios por conta própria antes de solicitar uma solução.

Não existe problema em dizer:

> "Não entendi."

> "Esqueci."

> "Não sei."

Essas respostas ajudam a identificar o que precisa ser estudado novamente.

---

# Como cada assunto será estudado

Cada assunto seguirá aproximadamente esta sequência:

### 1. Introdução

Entender qual problema o conceito resolve.

### 2. Teoria

Estudar o conceito em profundidade.

### 3. Exemplos

Observar exemplos pequenos e específicos.

### 4. Verificação

Responder perguntas curtas para verificar se o conceito foi realmente compreendido.

### 5. Exercício

Implementar um exercício pequeno, objetivo e focado.

### 6. Correção

Analisar a implementação, erros e decisões tomadas.

### 7. Consolidação

Quando necessário:

- repetir o conceito;
- fazer uma pequena variação;
- corrigir uma interpretação;
- refatorar;
- realizar outro exercício.

### 8. Avanço

Somente depois de possuir compreensão suficiente do conceito.

---

# Estrutura do Repositório

Cada assunto terá sua própria pasta.

```text
backend-java-mentoria/
│
├── README.md
│
├── 00-fundamentos/
│
├── 01-poo/
│   ├── classes-e-objetos/
│   │   ├── README.md
│   │   └── exercicio/
│   │
│   ├── encapsulamento/
│   │   ├── README.md
│   │   └── exercicio/
│   │
│   ├── heranca/
│   │   ├── README.md
│   │   └── exercicio/
│   │
│   └── polimorfismo/
│       ├── README.md
│       └── exercicio/
│
├── 02-java-moderno/
│   ├── record/
│   │   ├── README.md
│   │   └── exercicio/
│   │
│   ├── optional/
│   │   ├── README.md
│   │   └── exercicio/
│   │
│   └── pattern-matching/
│       ├── README.md
│       └── exercicio/
│
├── 03-collections/
│   ├── arraylist/
│   ├── linkedlist/
│   ├── hashset/
│   ├── hashmap/
│   └── treemap/
│
└── ...
```

## Estrutura de cada assunto

O `README.md` de cada assunto funcionará como material de consulta.

Exemplo:

```text
hashmap/
│
├── README.md
│
└── exercicio/
    └── Main.java
```

O `README.md` poderá conter:

```text
O que é?
Por que existe?
Como funciona?
Fundamentos relacionados
Exemplos
Quando utilizar
Quando não utilizar
Limitações
Erros comuns
Perguntas de verificação
Exercício
```

Dessa forma, o repositório também funcionará como uma **base de conhecimento pessoal** para consultas futuras.

---

# Currículo

## Módulo 0 — Fundamentos e Diagnóstico

**Objetivo:**
Identificar conhecimentos atuais e corrigir lacunas fundamentais.

### Conteúdos

- Sintaxe básica
- Tipos
- Variáveis
- Operadores
- Condicionais
- Loops
- Métodos
- Classes
- Objetos
- Referências
- Memória básica
- Exceções
- Arrays
- Conceitos básicos de OOP

---

## Módulo 1 — Programação Orientada a Objetos

### Conteúdos

- Classes
- Objetos
- Atributos
- Métodos
- Construtores
- Encapsulamento
- Modificadores de acesso
- Composição
- Herança
- Polimorfismo
- Abstração
- Interfaces
- Classes abstratas
- `equals()`
- `hashCode()`
- `toString()`
- Imutabilidade

---

## Módulo 2 — Java Moderno e Recursos da Linguagem

### Conteúdos

- `var`
- `record`
- `enum`
- `final`
- `static`
- `Optional`
- Sealed Classes
- Pattern Matching
- Text Blocks
- Boas práticas da linguagem

---

## Módulo 3 — Arrays e Collections

### Conteúdos

- Arrays
- `List`
- `ArrayList`
- `LinkedList`
- `Set`
- `HashSet`
- `Map`
- `HashMap`
- `TreeMap`
- `Queue`
- `Deque`
- Iteração
- Complexidade básica

Também serão estudados os conceitos por trás das estruturas quando necessário.

---

## Módulo 4 — Generics

### Conteúdos

- Classes genéricas
- Métodos genéricos
- Type Parameters
- Bounded Types
- Wildcards
- `extends`
- `super`
- PECS
- Type Erasure

---

## Módulo 5 — Exceptions e Tratamento de Erros

### Conteúdos

- `Exception`
- `RuntimeException`
- Checked Exceptions
- Unchecked Exceptions
- `try`
- `catch`
- `finally`
- `throw`
- `throws`
- Criação de exceptions
- Boas práticas
- Tratamento adequado de erros

---

## Módulo 6 — Java Funcional

### Conteúdos

- Interfaces funcionais
- Lambdas
- Method References
- `Predicate`
- `Function`
- `Consumer`
- `Supplier`
- Composição de funções

---

## Módulo 7 — Streams

### Conteúdos

- Stream
- Pipeline
- Operações intermediárias
- Operações terminais
- `filter`
- `map`
- `flatMap`
- `sorted`
- `distinct`
- `reduce`
- `collect`
- Collectors
- Lazy Evaluation

---

## Módulo 8 — Concorrência

### Conteúdos

- Processos
- Threads
- Criação de Threads
- `start()` e `run()`
- Ciclo de vida
- `Runnable`
- `Callable`
- `ExecutorService`
- Sincronização
- `synchronized`
- Race Condition
- Atomicidade
- Locks
- `AtomicInteger`
- `volatile`
- `CompletableFuture`
- Virtual Threads

Cada conceito será acompanhado de exercícios pequenos para demonstrar seu comportamento.

---

## Módulo 9 — JVM

### Conteúdos

- JVM
- Bytecode
- Compilação
- JIT
- Stack
- Heap
- Referências
- Objetos
- Garbage Collector
- Memória
- Class Loading

O objetivo é compreender o que acontece por trás do código Java.

---

## Módulo 10 — Estruturas de Dados e Algoritmos

### Conteúdos

- Complexidade Big O
- Busca
- Ordenação
- Recursão
- Pilha
- Fila
- Árvores
- Mapas
- Grafos
- Algoritmos básicos

A prática será feita principalmente por meio de pequenos problemas algorítmicos.

---

## Módulo 11 — Banco de Dados

### Conteúdos

- SQL
- Modelagem
- Relacionamentos
- Índices
- Chaves
- Transações
- ACID
- Isolamento
- Locks
- MVCC
- Query Plans
- Otimização

---

## Módulo 12 — Engenharia de Software

### Conteúdos

- Clean Code
- SOLID
- Coesão
- Acoplamento
- Composição
- Abstração
- Design Patterns
- Princípios de Design
- Refatoração
- Testes
- Manutenção de código

---

## Módulo 13 — Arquitetura

### Conteúdos

- Arquitetura em camadas
- Clean Architecture
- Hexagonal Architecture
- DDD
- Event-Driven Architecture
- CQRS
- Comunicação entre componentes
- Princípios arquiteturais

---

## Módulo 14 — Spring

Somente depois de consolidar os fundamentos anteriores.

### Conteúdos

- Spring Core
- IoC
- Dependency Injection
- Beans
- ApplicationContext
- Configuração
- Annotations
- Spring Boot
- Spring MVC
- REST
- Validação
- Spring Data
- Transações
- Spring Security

---

## Módulo 15 — Spring Internals

Aprofundamento no funcionamento interno do Spring.

### Conteúdos

- `BeanFactory`
- `ApplicationContext`
- Bean Lifecycle
- Reflection
- Proxies
- AOP
- Auto-Configuration
- Dependency Injection
- Criação e gerenciamento de Beans

---

# Projetos

Projetos maiores não são obrigatórios em cada módulo.

Eles serão desenvolvidos quando houver um conjunto de conceitos suficiente para justificar sua construção.

Possíveis projetos:

- Mini Dependency Injection Framework
- Mini HTTP Server
- Mini ORM
- Mini Hibernate
- Mini Spring
- Message Broker
- Cache
- Scheduler
- Sistemas concorrentes
- Aplicações Backend completas

Os projetos devem consolidar conhecimentos já estudados, e não substituir o estudo dos fundamentos.

---

# Regras dos Exercícios

Os exercícios devem ser:

- pequenos;
- objetivos;
- focados em um conceito;
- fáceis de testar;
- independentes quando possível;
- suficientemente desafiadores para exigir raciocínio.

Um exercício não precisa gerar uma aplicação completa.

### Exemplo

**Conceito:** `HashMap`

**Exercício:**
Criar uma classe simples que demonstre o efeito de `equals()` e `hashCode()` em uma coleção baseada em hashing.

O objetivo é entender o comportamento do conceito, não construir um sistema que utilize `HashMap`.

---

# Avaliação

A avaliação será contínua.

Serão observados:

- compreensão dos conceitos;
- capacidade de explicar;
- capacidade de implementar;
- raciocínio;
- autonomia;
- qualidade do código;
- capacidade de identificar erros;
- evolução ao longo do tempo.

Não haverá necessidade de notas tradicionais.

Um conceito pode ser classificado como:

- **Não compreendido**
- **Compreendido parcialmente**
- **Compreendido**
- **Dominado**

---

# Critério para Avançar

Não é necessário dominar absolutamente todos os detalhes de um assunto antes de avançar.

Porém, deve existir compreensão suficiente para:

1. explicar o conceito;
2. reconhecer quando utilizá-lo;
3. utilizar o conceito em um exercício simples;
4. entender seus principais problemas e limitações.

Assuntos avançados poderão ser revisitados posteriormente.

---

# Registro de Conhecimento

O registro principal da mentoria será o próprio repositório.

Cada assunto deverá guardar seu conhecimento de forma independente.

A ideia é que, no futuro, seja possível entrar diretamente em uma pasta e revisar aquele conceito sem depender da conversa original.

Exemplo:

```text
03-collections/
└── hashmap/
    └── README.md
```

Esse arquivo deve ser suficiente para relembrar:

- o que é `HashMap`;
- por que ele existe;
- como funciona;
- quais conceitos estão envolvidos;
- quando utilizá-lo;
- limitações;
- erros comuns;
- exemplos;
- exercícios realizados.

---

# Como utilizar este repositório com a mentoria

Este README funciona como o **contexto principal da mentoria**.

Quando uma nova conversa for iniciada, o conteúdo deste arquivo poderá ser fornecido ao mentor para recuperar:

- objetivo da mentoria;
- metodologia;
- currículo;
- regras;
- estrutura dos assuntos;
- critério para avanço;
- filosofia de estudo.

A conversa não deve substituir o repositório.

O repositório é a **fonte permanente do conhecimento construído durante a mentoria**.

A conversa serve para:

- explicar conceitos;
- tirar dúvidas;
- propor exercícios;
- analisar respostas;
- realizar code reviews;
- identificar lacunas;
- decidir quando avançar.

---

# Progresso

- [ ] Módulo 0 — Fundamentos e Diagnóstico
- [ ] Módulo 1 — Programação Orientada a Objetos
- [ ] Módulo 2 — Java Moderno
- [ ] Módulo 3 — Arrays e Collections
- [ ] Módulo 4 — Generics
- [ ] Módulo 5 — Exceptions
- [ ] Módulo 6 — Java Funcional
- [ ] Módulo 7 — Streams
- [ ] Módulo 8 — Concorrência
- [ ] Módulo 9 — JVM
- [ ] Módulo 10 — Estruturas de Dados e Algoritmos
- [ ] Módulo 11 — Banco de Dados
- [ ] Módulo 12 — Engenharia de Software
- [ ] Módulo 13 — Arquitetura
- [ ] Módulo 14 — Spring
- [ ] Módulo 15 — Spring Internals

---

# Estado Atual

**Módulo:** 0 — Fundamentos e Diagnóstico

**Assunto atual:** Diagnóstico inicial

**Status:** Em preparação

**Próximo objetivo:** Realizar o diagnóstico e identificar lacunas nos fundamentos de Java.

---

# Princípio Final

> **Não estudar para terminar a trilha.**
>
> **Estudar para compreender.**
>
> **Não construir por construir.**
>
> **Construir quando a prática realmente ajudar a consolidar o conhecimento.**
>
> **Não decorar soluções.**
>
> **Aprender a raciocinar sobre os problemas.**
>
> **Não depender da mentoria para sempre.**
>
> **Usá-la para desenvolver autonomia.**
