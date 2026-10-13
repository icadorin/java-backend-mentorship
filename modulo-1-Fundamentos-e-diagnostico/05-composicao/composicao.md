# Composição

## Perguntas e Respostas

### 1. O que é composição em POO?

Composição é uma relação entre objetos em que eles colaboram, permitindo dividir responsabilidades entre diferentes objetos.

---

### 2. O que significa dizer que composição representa uma relação "tem um" (`has-a`)?

Objetos com responsabilidades que estão relacionadas de alguma maneira com o objeto que possui/usa.

---

### 3. Qual é a diferença principal entre composição e herança?

Composição é "tem um", um objeto depende do outro de alguma forma, herança é "é um", que seria uma especificação de um outro objeto.

---

### 4. Por que composição também está ligada a uma questão de arquitetura?

Composição também está ligada a uma questão de arquitetura. Pegar um conceito e separar em responsabilidades, depois transformar em diferentes objetos que são utilizados em conjunto.

---

### 5. Por que faz sentido o `Carro` possuir um `Motor`?

Faz sentido porque satisfaz exatamente a ideia de composição, "tem um". Carro tem um motor.

---

### 6. Qual é a diferença entre classe, objeto e referência?

Classe é a abstração de um conceito, objeto é uma instância da classe e referência é uma variável que permite acessar/localizar um objeto.

---

### 7. Por que o atributo `Engine` do `Car` deve ser `private`?

Encapsulamento, caso contrário qualquer classe que instanciasse o objeto poderia setar o estado inicial do objeto com o valor que quisesse.

---

### 8. O que é delegação?

Delegação é quando um objeto determina uma ação a outro objeto, porém não sabe como isso é feito, não executa a ação diretamente.

---

### 9. Por que podemos dizer que `Car` e `Engine` possuem responsabilidades diferentes?

O carro não deveria conhecer detalhes internos do funcionamento do motor.

---

### 10. A composição exige que o objeto interno seja criado dentro da classe externa?

A composição é um conceito que acontece entre relacionamento de objetos, mas não existe uma regra específica de código de como deve ser. O `Car` pode ser instanciado dentro do `Car`, ou junto com o `Car` e ser passado para ele depois.

---

### 11. Por que passar o `Engine` pelo construtor também pode estabelecer uma relação de composição?

A composição não se define pela forma que o objeto é instanciado, mas pelo conceito entre os objetos.

---

### 12. Se o `Carro` possui um `Motor`, isso significa que ele controla diretamente o estado interno do `Engine`?

Não, significa que pelo `Carro` possuir um `Motor`, ele interage, mas quem altera o estado da `Engine` é recomendado que seja o próprio objeto, para manter o encapsulamento.

---

### 13. Qual é a relação entre composição e encapsulamento?

Composição está relacionada à interação de objetos e conceito que os une, encapsulamento é o princípio de controlar acesso de estado e implementação de um objeto.

---

### 14. O que acontece se a implementação interna do `Engine` mudar?

Significa que `Car` não sofre com essa mudança, pois ele não precisa saber como a função é executada, apenas que seja executada.

---

### 15. Qual é a principal ideia que tu leva sobre composição?

Composição permite construir objetos maiores a partir da colaboração de objetos menores, distribuindo responsabilidades entre eles.
