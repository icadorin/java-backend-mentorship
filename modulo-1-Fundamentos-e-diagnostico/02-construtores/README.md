# Construtores

## 1 — O que é um construtor?

Construtor é um mecanismo da classe responsável por **inicializar uma instância no momento em que ela é criada**.

Ele pode receber parâmetros para definir os valores iniciais que farão parte do estado do objeto.

Conceitualmente:

```text
new Person(...)
      ↓
criação da instância
      ↓
execução do construtor
      ↓
inicialização do estado
      ↓
objeto pronto
```

---

## 2 — Como identificar um construtor?

Um construtor possui algumas características específicas:

* possui o mesmo nome da classe;
* não possui tipo de retorno;
* pode receber parâmetros;
* participa da inicialização da instância;
* é executado durante a criação do objeto.

Exemplo conceitual:

```text
Person()
```

é um construtor da classe `Person`.

Já:

```text
void Person()
```

não é um construtor, pois possui tipo de retorno.

---

## 3 — Construtor e método

Construtor e método possuem finalidades diferentes.

### Construtor

Responsável pela **inicialização da instância**.

### Método

Responsável por representar um **comportamento ou operação** da classe.

| Construtor                     | Método                     |
| ------------------------------ | -------------------------- |
| Mesmo nome da classe           | Possui um nome próprio     |
| Não possui retorno             | Pode possuir retorno       |
| Inicializa a instância         | Executa um comportamento   |
| Participa da criação do objeto | É executado quando chamado |
| Pode receber parâmetros        | Pode receber parâmetros    |

Ter parâmetros, portanto, não é o que diferencia um construtor de um método.

---

## 4 — Relação entre `new` e construtor

O operador `new` é utilizado para criar uma nova instância.

Durante essa criação, um construtor compatível é executado.

Conceitualmente:

```text
new Person(...)
      ↓
nova instância de Person
      ↓
construtor correspondente
      ↓
inicialização da instância
```

O construtor não é o responsável sozinho por "criar o objeto". Ele participa do processo de criação, principalmente realizando sua inicialização.

---

## 5 — Construtor padrão fornecido pelo Java

Quando uma classe **não declara nenhum construtor**, o Java fornece automaticamente um construtor sem argumentos.

Exemplo conceitual:

```text
Person()
```

Esse construtor permite uma criação sem argumentos:

```text
new Person()
```

É importante distinguir:

* **construtor sem argumentos**: qualquer construtor que não recebe parâmetros;
* **construtor padrão fornecido pelo compilador**: o construtor sem argumentos criado automaticamente quando nenhum construtor foi declarado.

---

## 6 — O que acontece quando declaramos um construtor?

Quando declaramos explicitamente um construtor, o Java deixa de fornecer automaticamente o construtor sem argumentos.

Por exemplo, se a classe possui apenas:

```text
Person(String name)
```

não significa que também exista:

```text
Person()
```

Nesse caso, uma tentativa de:

```text
new Person()
```

não poderá ser compilada, pois não existe um construtor compatível com essa chamada.

Para permitir ambas as formas, seria necessário declarar também um construtor sem argumentos.

---

## 7 — Parâmetros do construtor

Um construtor pode receber parâmetros.

Esses parâmetros permitem fornecer informações utilizadas durante a inicialização da instância.

Conceitualmente:

```text
new Person("Israel", 28)
          ↓         ↓
        name       age
          ↓         ↓
       construtor
          ↓
   estado inicial
```

Os parâmetros não são necessariamente os próprios atributos. Eles são valores recebidos pelo construtor que podem ser utilizados para inicializar ou definir o estado da instância.

---

## 8 — Sobrecarga de construtores

Sobrecarga de construtores ocorre quando uma classe possui **mais de um construtor com diferentes listas de parâmetros**.

Isso permite criar uma instância de diferentes formas, de acordo com as informações disponíveis no momento da criação.

Conceitualmente:

```text
Person()
Person(String name)
Person(String name, int age)
```

Cada construtor possui uma lista de parâmetros diferente.

Ao utilizar `new`, o Java identifica o construtor compatível com os argumentos fornecidos.

Por exemplo:

```text
new Person()
          ↓
Person()

new Person("Israel")
          ↓
Person(String)

new Person("Israel", 28)
          ↓
Person(String, int)
```

O nome dos parâmetros não diferencia construtores. Portanto:

```text
Person(String name)
Person(String personName)
```

não são sobrecargas diferentes, pois possuem a mesma lista de parâmetros.

---

## 9 — `this`

`this` **não identifica um construtor**.

`this` é uma referência à **instância atual**.

Podemos pensar em:

```text
this
 ↓
"este objeto aqui"
```

Ele é especialmente útil quando um parâmetro possui o mesmo nome de um atributo.

Conceitualmente:

```text
name
 ↓
parâmetro recebido

this.name
 ↓
atributo da instância atual
```

Assim, `this.name` e `name` podem representar coisas diferentes dentro do mesmo construtor.

---

## 10 — Estado inicial do objeto

O construtor pode estabelecer o estado inicial da instância utilizando os valores recebidos como parâmetros.

Por exemplo:

```text
new Person("Israel", 28)
        ↓
construtor recebe os valores
        ↓
atributos são inicializados
        ↓
objeto possui seu estado inicial
```

Isso relaciona diretamente construtores ao conceito de **estado do objeto** estudado anteriormente.

---

## 11 — Construtor e estado do objeto

O estado de uma instância é representado pelos valores dos seus atributos de instância em determinado momento.

O construtor pode definir esses valores inicialmente.

Depois da criação, métodos podem alterar esse estado.

Conceitualmente:

```text
Construtor
    ↓
estado inicial
    ↓
métodos
    ↓
alterações de estado
```

Portanto:

> **O construtor estabelece o estado inicial; os métodos podem modificar o estado durante a vida da instância.**

---

## 12 — Resumo

* Construtor inicializa uma instância durante sua criação.
* Possui o mesmo nome da classe.
* Não possui tipo de retorno.
* Pode receber parâmetros.
* `new` participa da criação da instância e provoca a execução de um construtor compatível.
* Se nenhum construtor for declarado, o Java fornece automaticamente um construtor sem argumentos.
* Ao declarar um construtor, o Java deixa de fornecer automaticamente esse construtor sem argumentos.
* Sobrecarga de construtores permite diferentes formas de inicializar uma instância por meio de diferentes listas de parâmetros.
* `this` representa a instância atual.
* `this` é frequentemente utilizado para diferenciar atributos de parâmetros com o mesmo nome.
* O construtor pode estabelecer o estado inicial do objeto.
* Métodos representam comportamentos e podem alterar o estado do objeto.
