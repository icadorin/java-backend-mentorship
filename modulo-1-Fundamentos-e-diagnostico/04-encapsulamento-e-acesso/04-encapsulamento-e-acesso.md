# Encapsulamento e Modificadores de Acesso

## Perguntas e Respostas

### 1. O que é encapsulamento em POO?

Encapsulamento é o controle de acesso ao estado e aos comportamentos de um objeto.

---

### 2. Qual problema o encapsulamento tenta resolver?

O acesso total aos atributos do objeto. O encapsulamento ajuda a prevenir alterações inválidas no estado do objeto.

---

### 3. O que o `private` faz em Java?

`private` restringe o acesso direto a um atributo ou método à própria classe em que foi declarado.

---

### 4. Se um atributo é `private`, como outra classe pode interagir com ele?

Pode interagir por meio de métodos que são disponibilizados e controlados pela própria classe, para que o estado não seja alterado de qualquer forma.

---

### 5. O que é um getter?

Retorna o valor de um atributo.

---

### 6. O que é um setter?

Permite alterar o valor de um atributo por meio de um método.

---

### 7. Todo atributo `private` precisa obrigatoriamente ter getter e setter? Por quê?

Se um atributo é `private`, é recomendado utilizar um método com uma lógica de validação para controlar sua alteração. Já o método getter pode ser utilizado quando necessário.

Não é obrigatório que todo atributo tenha getter e setter.

---

### 8. Qual é a diferença entre `setSaldo(valor)` e `sacar(valor)`?

Usar um método para alterar o estado pode ser mais seguro, pois ele controla como a alteração será feita e permite verificar as regras necessárias antes de executá-la.

---

### 9. Quais são os quatro principais níveis de acesso em Java?

`private`, `public`, `protected` e package-private (também chamado informalmente de default).

---

### 10. O que é `private` e qual é o seu alcance?

`private` restringe o acesso direto, permitindo que o membro seja acessado somente dentro da própria classe em que foi declarado.

---

### 11. O que é package-private?

É o nível de acesso padrão quando nenhum modificador de acesso é declarado. Permite o acesso ao membro por classes do mesmo pacote, respeitadas as regras da linguagem Java.

---

### 12. O que é `protected`?

Permite o acesso dentro da própria classe, no mesmo pacote e por subclasses em outros pacotes, respeitadas as regras específicas de acesso da linguagem Java.

---

### 13. O que significa `public`?

Permite que o membro seja acessado de qualquer lugar onde a classe e o próprio membro estejam acessíveis.

---

### 14. Qual é a diferença entre encapsulamento e modificadores de acesso?

Encapsulamento é o conceito mais amplo. Os modificadores de acesso fazem parte dos recursos utilizados para implementar esse princípio, mas encapsulamento não se resume apenas a isso.

---

### 15. Qual é a relação entre encapsulamento e a separação entre interface e implementação?

Interface é um contrato que define os comportamentos disponibilizados para utilização. Implementação é como esses comportamentos são executados propriamente.

O encapsulamento permite que uma classe disponibilize comportamentos sem expor necessariamente os detalhes de sua implementação interna.

---

### 16. Por que uma classe deve controlar seus próprios comportamentos e seu próprio estado?

Para manter o controle e a proteção do estado, evitando que ele seja utilizado ou alterado de forma que contrarie o comportamento esperado.

---

### 17. Qual é a principal ideia que tu leva sobre encapsulamento?

Encapsulamento protege o estado do objeto por meio do controle de acesso e da definição de como seus comportamentos podem ser utilizados.

---

## Resumo

* Encapsulamento controla o acesso ao estado e aos comportamentos de um objeto.
* `private` restringe o acesso direto a membros à própria classe em que foram declarados.
* Getters permitem consultar valores; setters permitem alterá-los por meio de métodos.
* Nem todo atributo precisa de getter ou setter.
* Métodos que representam comportamentos, como `sacar()` e `depositar()`, podem aplicar regras antes de modificar o estado.
* Package-private permite acesso dentro do mesmo pacote.
* `protected` permite acesso dentro do mesmo pacote e por subclasses, respeitadas as regras da linguagem.
* `public` permite acesso amplo, desde que a classe e o membro estejam acessíveis.
* Encapsulamento é um princípio de POO; modificadores de acesso são recursos da linguagem Java que ajudam a implementá-lo.
* A separação entre interface e implementação permite utilizar os comportamentos de uma classe sem depender dos detalhes internos de sua execução.
