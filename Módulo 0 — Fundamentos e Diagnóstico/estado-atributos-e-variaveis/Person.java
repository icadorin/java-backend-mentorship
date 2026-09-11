public class Person {

    String name = "Israel"; // atributo
    int age = 20; // atributo (parte do estado do objeto)

    public static void main(String[] args) {
        Person person = new Person(); // nova instância de Person

        person.birthday(1); // altera o valor de um atributo e, consequentemente, o estado do objeto
        System.out.println(person.age);
    }

    public void birthday(int years) { // método; years é um parâmetro
        // years existe durante a execução do método
        age += years;
    }
}